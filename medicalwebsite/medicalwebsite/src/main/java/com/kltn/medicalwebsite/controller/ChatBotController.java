package com.kltn.medicalwebsite.controller;


import com.kltn.medicalwebsite.request.PromptRequest;
import com.kltn.medicalwebsite.service.ChatGptService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chatbot")
public class ChatBotController {

    private  final ChatGptService chatGptService;

    public ChatBotController(ChatGptService chatGptService) {
        this.chatGptService = chatGptService;
    }


    @PostMapping
    public  String chat(@RequestBody  PromptRequest promptRequest){
        return  chatGptService.getChatResponse(promptRequest);
    }
}
