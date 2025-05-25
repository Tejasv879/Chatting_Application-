import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) {
        try (
            Socket socket = new Socket("localhost", 1234);
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));
        ) {
            System.out.println("Connected to chat server.");

            Thread receiveThread = new Thread(() -> {
                try {
                    String message;
                    while ((message = input.readLine()) != null) {
                        System.out.println(message);
                    }
                } catch (IOException e) {
                    System.out.println("Connection closed.");
                }
            });

            receiveThread.start();

            String userInput;
            while ((userInput = consoleInput.readLine()) != null) {
                output.println(userInput);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}