import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
    private List<User> users = new ArrayList<>();
    private List<Message> messages = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void sendMessage(User sender, String content) {
        if (users.contains(sender)) {
            Message message = new Message(sender, content);
            messages.add(message);
        } else {
            System.out.println("User not in chat room!");
        }
    }

    public void showChatHistory() {
        for (Message msg : messages) {
            System.out.println(msg);
        }
    }
}