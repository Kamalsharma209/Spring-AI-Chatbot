package com.kamal.spring_ai_chatbot.dto;

import jakarta.validation.constraints.NotBlank;

public record ChatRequest(

        @NotBlank
        String message

) {}