package com.kltn.medicalwebsite.service;


import com.kltn.medicalwebsite.request.ChatGPTRequest;
import com.kltn.medicalwebsite.request.PromptRequest;
import com.kltn.medicalwebsite.response.ChatGPTResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class ChatGptService {


    private  final RestClient restClient;

    public ChatGptService(RestClient restClient) {
        this.restClient = restClient;
    }


    @Value("${openapi.api.key}")
    private String apiKey;


    @Value("${openapi.api.model}")
    private  String model;

    @Value("${openai.api.token}")
    private  Long max_tokens;

    public  String getChatResponse(PromptRequest promptRequest){
        ChatGPTRequest chatGPTRequest = new ChatGPTRequest(model, List.of(new ChatGPTRequest.Message("user",promptRequest.prompt())),max_tokens);

       ChatGPTResponse response = restClient.post().header("Authorization","Bearer "+ apiKey).header("Content-Type","application/json").body(chatGPTRequest).retrieve().body(ChatGPTResponse.class);
        return  response.choices().get(0).message().content();
    }
}
