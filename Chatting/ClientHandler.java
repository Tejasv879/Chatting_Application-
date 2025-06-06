import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.net.Socket;

class ClientHandler extends Thread {
    private final Socket socket;
    private final ChatServer server;
    private PrintWriter out;
    private String userName;

    public ClientHandler(Socket socket, ChatServer server) {
        this.socket = socket;
        this.server = server;
    }

    public void sendMessage(String message) {
        out.println(message);
    }

    public void run() {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true)) {

            this.out = writer;
            writer.println("Enter your name:");
            userName = in.readLine();
            server.broadcast(userName + " has joined the chat.", this);

            String clientMessage;
            while ((clientMessage = in.readLine()) != null) {
                if (clientMessage.equalsIgnoreCase("exit")) break;
                server.broadcast(userName + ": " + clientMessage, this);
            }
            server.broadcast(userName + " has left the chat.", this);

        } catch (IOException e) {
            System.out.println("Client disconnected.");
        }
    }
}
