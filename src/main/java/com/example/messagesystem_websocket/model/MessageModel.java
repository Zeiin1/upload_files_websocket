package com.example.messagesystem_websocket.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class MessageModel {
    @Getter
    @Setter
    private String message;
    @Getter
    @Setter
    private String fromLogin;
}
