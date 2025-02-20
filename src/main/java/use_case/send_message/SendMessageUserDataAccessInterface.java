package use_case.send_message;

import entity.Message;
import java.util.ArrayList;
import java.util.Map;

public interface SendMessageUserDataAccessInterface {
    void saveMessage(Message message);
}
