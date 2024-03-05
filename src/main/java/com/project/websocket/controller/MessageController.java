package com.project.websocket.controller;

import com.project.websocket.model.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MessageController {

    private final SimpMessagingTemplate simpMessagingTemplate;

    /*
        /sub/channel/12345          -구독 channelId - 12345
        /pub/hello                  -메시지발행
     */


    @MessageMapping("/hello")
    public void message(Message message){
        simpMessagingTemplate.convertAndSend("/sub/channel/"+ message.getChannelId(),message);
    }
}
