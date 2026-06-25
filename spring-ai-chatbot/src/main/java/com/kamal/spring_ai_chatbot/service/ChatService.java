package com.kamal.spring_ai_chatbot.service;
import com.kamal.spring_ai_chatbot.dto.ChatResponse;

public interface ChatService {

    ChatResponse chat(String message);

}