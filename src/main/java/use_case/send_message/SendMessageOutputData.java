package use_case.send_message;

import entity.Message;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class SendMessageOutputData {
    private String message;
    private String senderID;
    private LocalDateTime timestamp;
    public SendMessageOutputData(String message, String senderID, LocalDateTime timestamp) {
    this.message = message;
    }

    public String getMessage() {
        return message;
    }
    public String getSenderID() {
        return senderID;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
