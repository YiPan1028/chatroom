
package interface_adapter.sendMessage;

import interface_adapter.ViewModel;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class SendMessageViewModel extends ViewModel<SendMessageState> {
    // private final List<String> messages = new ArrayList<>();
    // private final List<Consumer<List<String>>> listeners = new ArrayList<>();
    public static final String TITLE_LABEL = "Chatroom";
    public static final String SEND_BUTTON_LABEL = "Send";

    public SendMessageViewModel() {
        super("send message");
        setState(new SendMessageState());
    }


    /*
    // 添加新消息
    public void appendMessage(String message) {
        messages.add(message);
    }

    // 获取所有消息
    public List<String> getMessages() {
        return messages;
    }

    // 监听 UI 更新
    public void addListener(Consumer<List<String>> listener) {
        listeners.add(listener);
    }

    // 通知所有监听者 (UI 组件) 进行更新
    public void notifyListeners() {
        for (Consumer<List<String>> listener : listeners) {
            listener.accept(messages);
        }
    }
     */
}

