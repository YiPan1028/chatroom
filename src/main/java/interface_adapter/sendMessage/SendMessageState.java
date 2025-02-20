package interface_adapter.sendMessage;

import entity.Message;

import java.time.LocalDateTime;

public class SendMessageState {
    private final String state = "SendMessageState";
    private String message;
    private String senderID;
    private LocalDateTime timestamp;

    public void setMessage(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }

    public void setSenderID(String senderID) {
        this.senderID = senderID;
    }

    public String getSenderID() {
        return senderID;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}

