import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String name = scanner.nextLine();
        User user = new User(name);
        chatRoom.addUser(user);

        while (true) {
            System.out.print("Enter message (or 'exit'): ");
            String message = scanner.nextLine();
            if (message.equalsIgnoreCase("exit")) break;
            chatRoom.sendMessage(user, message);
        }

        System.out.println("Chat History:");
        chatRoom.showChatHistory();
    }
}