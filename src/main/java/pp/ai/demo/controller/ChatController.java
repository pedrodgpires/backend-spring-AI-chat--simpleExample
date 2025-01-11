package pp.ai.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pp.ai.demo.services.ChatService;

@RestController
@RequestMapping("/chat")
public class ChatController {

    private ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    /*
    * This method is used to send a message to the chat model
    *
    * @param msg The message to send
    * @return The response from the chat model
    */
    @GetMapping("/send-msg")
    public String chat (@RequestParam String msg) {
        try {
            return chatService.chat(msg);
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }


}
