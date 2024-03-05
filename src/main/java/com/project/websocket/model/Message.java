package com.project.websocket.model;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class Message {
    private String type;

    private String channelId;
    private String sender;
    private String message;

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void newConnect() {
        this.type = "new";
    }

    public void closeConnect() {
        this.type = "close";
    }


}
