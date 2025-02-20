package view;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import interface_adapter.login.LoginState;
import interface_adapter.login.LoginViewModel;
import interface_adapter.sendMessage.SendMessageController;
import interface_adapter.sendMessage.SendMessageState;
import interface_adapter.sendMessage.SendMessageViewModel;

public class SendMessageView extends JPanel implements ActionListener, PropertyChangeListener {

    private final String viewName = "send message";
    private final SendMessageViewModel sendMessageViewModel;
    private final JButton send;
    private final JTextField messageTextField = new JTextField(20);
    private SendMessageController sendMessageController;

    public SendMessageView(SendMessageViewModel sendMessageViewModel) {
        this.sendMessageViewModel = sendMessageViewModel;
        this.sendMessageViewModel.addPropertyChangeListener(this);

        final JPanel buttons = new JPanel();
        send = new JButton("send");


        send.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (evt.getSource().equals(send)) {
                    final SendMessageState currentState = sendMessageViewModel.getState();

                    sendMessageController.execute(
                            currentState.getMessage(),
                            currentState.getSenderID(),
                            currentState.getTimestamp()
                    );
                }
            }
        }
        );
    }

    public String getViewName() {
        return viewName;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {

    }
}


