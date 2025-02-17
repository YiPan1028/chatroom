import java.time.LocalDateTime;
import java.util.UUID;

public class Message {
    private String id; // 唯一标识（UUID）
    private String senderId; // 发送者 ID
    private String receiverId; // 接收者 ID（可选，群聊为空）
    private String content; // 消息内容
    private LocalDateTime timestamp; // 发送时间

    // 构造方法
    public Message(String senderId, String receiverId, String content, boolean isGroupMessage) {
        this.id = UUID.randomUUID().toString(); // 生成唯一 ID
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.content = content;
        this.timestamp = LocalDateTime.now(); // 记录发送时间
    }

    // Getter & Setter 方法
    public String getId() { return id; }
    public String getSenderId() { return senderId; }
    public String getReceiverId() { return receiverId; }
    public String getContent() { return content; }
    public LocalDateTime getTimestamp() { return timestamp; }


    @Override
    public String toString() {
        return "[" + timestamp + "] " + senderId + ": " + content;
    }
}