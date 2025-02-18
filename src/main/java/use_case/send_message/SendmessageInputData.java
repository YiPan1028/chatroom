package use_case.send_message;

import java.time.LocalDateTime;

public class SendmessageInputData {
    final private String id; // 唯一标识（UUID）
    final private String senderId; // 发送者 ID
    // final private String receiverId; // 接收者 ID（可选，群聊为空）
    final private String content; // 消息内容
    final private LocalDateTime timestamp; // 发送时间

    public SendmessageInputData(String id, String senderId, String content, LocalDateTime timestamp) {
        this.id = id;
        this.senderId = senderId;
        // this.receiverId = receiverId;
        this.content = content;
        this.timestamp = timestamp;
    }

    public String getId() {
        return id;
    }

    public String getSenderId() {
        return senderId;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
