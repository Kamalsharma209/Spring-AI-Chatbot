package com.kamal.spring_ai_chatbot.controller;

import com.kamal.spring_ai_chatbot.dto.ChatRequest;
import com.kamal.spring_ai_chatbot.dto.ChatResponse;
import com.kamal.spring_ai_chatbot.service.ChatService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    private final ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @PostMapping
    public ChatResponse chat(@Valid @RequestBody ChatRequest request) {
        return chatService.chat(request.message());
    }
}