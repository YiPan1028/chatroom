package interface_adapter.sendMessage;

import use_case.send_message.SendMessageInputBoundary;
import use_case.send_message.SendMessageInputData;

import java.time.LocalDateTime;

public class SendMessageController {

    private final SendMessageInputBoundary sendMessageInputBoundary;

    // Constructor that injects the use case's input boundary
    public SendMessageController(SendMessageInputBoundary sendMessageInputBoundary) {
        this.sendMessageInputBoundary = sendMessageInputBoundary;
    }

    public void execute(String senderId, String message, LocalDateTime time) {
        final SendMessageInputData sendMessageInputData = new SendMessageInputData(senderId, message, time);

        sendMessageInputBoundary.execute(sendMessageInputData);
    }

}
