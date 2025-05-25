import java.time.LocalDateTime;

public class Message {
    private User sender;
    private String content;
    private LocalDateTime timestamp;

    public Message(User sender, String content) {
        this.sender = sender;
        this.content = content;
        this.timestamp = LocalDateTime.now();
    }

    public String toString() {
        return "[" + timestamp + "] " + sender.getUsername() + ": " + content;
    }
}