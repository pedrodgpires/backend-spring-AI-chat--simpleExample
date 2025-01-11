package pp.ai.demo.services;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.stereotype.Service;

@Service
public class ChatService {


    private ChatModel chatModel;

    public ChatService(ChatModel chatModel) {
        this.chatModel = chatModel;
    }

    /*
    * This method is used to send a message to the chat model
    *
    * @param msg The message to send
    * @return The response from the chat model
    */
    public String chat(String msg) {
        // right here, the chat model is called with the message and the response is returned
        return chatModel.call(msg);    }


}
