package com.project.websocket.model;

import com.project.websocket.constatns.MessageType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor
public record ChatMessage(
        @Enumerated(EnumType.STRING)
        MessageType type,

        String roomId,
        String sender,
        String message
) {
}
