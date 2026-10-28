package in.sanjurai.jobtrack;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

    @RestController
    @RequestMapping("/api/ai")
    @CrossOrigin(origins = "*")
    public class AiController {

        private final ChatClient chatClient;

        public AiController(ChatClient.Builder chatClientBuilder) {
            this.chatClient = chatClientBuilder.build();
        }

        @PostMapping("/chat")
        public Map<String, String> chat(@RequestBody Map<String, String> request) {

            String message = request.get("message");

            String reply = chatClient.prompt()
                    .user(message)
                    .call()
                    .content();

            return Map.of("reply", reply);
        }
    }


