package interface_adapter.sendMessage;

import javax.swing.SwingUtilities;

import interface_adapter.change_password.LoggedInState;
import use_case.login.LoginOutputData;
import use_case.send_message.SendMessageOutputBoundary;
import use_case.send_message.SendMessageOutputData;

public class SendMessagePresenter implements SendMessageOutputBoundary {
    private final SendMessageViewModel sendMessageViewModel;

    public SendMessagePresenter(SendMessageViewModel sendMessageViewModel) {
        this.sendMessageViewModel = sendMessageViewModel;
    }

    @Override
    public void prepareSuccessView(SendMessageOutputData outputData) {
        //final SendMessageState state = new SendMessageState();
        final SendMessageState sendMessageState = sendMessageViewModel.getState();
        sendMessageState.setMessage(outputData.getMessage());
        sendMessageViewModel.setState(sendMessageState);
        // 确保 UI 更新在 Swing 线程
        sendMessageViewModel.firePropertyChanged("SendMessageState");
    }

//    public void prepareSuccessView(LoginOutputData response) {
//        // On success, switch to the logged in view.
//
//        final LoggedInState loggedInState = loggedInViewModel.getState();
//        loggedInState.setUsername(response.getUsername());
//        this.loggedInViewModel.setState(loggedInState);
//        this.loggedInViewModel.firePropertyChanged();
//
//        this.viewManagerModel.setState(loggedInViewModel.getViewName());
//        this.viewManagerModel.firePropertyChanged();
//    }
}
