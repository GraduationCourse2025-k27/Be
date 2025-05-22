package com.kltn.medicalwebsite.request;

import java.util.List;

public record ChatGPTRequest(String model, List<Message> messages,Long max_tokens) {


    public  static  record Message(String role,String content){

    }
}
