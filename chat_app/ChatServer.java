import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {
    private static final int PORT = 1234;
    private static Set<PrintWriter> clientWriters = Collections.synchronizedSet(new HashSet<>());

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(PORT);
        System.out.println("Server started. Waiting for clients...");

        // Thread to accept clients
        Thread clientAccepter = new Thread(() -> {
            while (true) {
                try {
                    Socket clientSocket = serverSocket.accept();
                    System.out.println("Client connected: " + clientSocket);
                    new ClientHandler(clientSocket).start();
                } catch (IOException e) {
                    System.out.println("Error accepting client: " + e.getMessage());
                }
            }
        });

        clientAccepter.start();

        // Server input to send messages
        BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));
        String serverMessage;
        while ((serverMessage = consoleInput.readLine()) != null) {
            synchronized (clientWriters) {
                for (PrintWriter writer : clientWriters) {
                    writer.println("Server: " + serverMessage);
                }
            }
        }
    }

    private static class ClientHandler extends Thread {
        private Socket socket;
        private PrintWriter out;

        ClientHandler(Socket socket) {
            this.socket = socket;
        }

        public void run() {
            try (
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            ) {
                out = new PrintWriter(socket.getOutputStream(), true);
                clientWriters.add(out);

                String message;
                while ((message = in.readLine()) != null) {
                    System.out.println("Client " + socket.getPort() + ": " + message);
                    synchronized (clientWriters) {
                        for (PrintWriter writer : clientWriters) {
                            if (writer != out) {
                                writer.println("Client " + socket.getPort() + ": " + message);
                            }
                        }
                    }
                }
            } catch (IOException e) {
                System.out.println("Error with client: " + socket);
            } finally {
                try {
                    socket.close();
                } catch (IOException e) { }
                clientWriters.remove(out);
                System.out.println("Client disconnected: " + socket);
            }
        }
    }
}