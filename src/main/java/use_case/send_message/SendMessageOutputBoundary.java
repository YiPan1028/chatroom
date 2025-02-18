package use_case.send_message;

public interface SendMessageOutputBoundary {
    void presentSendMessageResponse(SendMessageResponseDTO response);
    void presentChatHistoryResponse(ChatHistoryResponseDTO response);
    void presentChatRoomResponse(ChatRoomResponseDTO response);

}
