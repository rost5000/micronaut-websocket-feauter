package com.example;

import com.example.llong.lol.lol.lol.library.http.api.ConfigurationItem;
import io.micronaut.serde.jackson.JacksonJsonMapper;
import io.micronaut.websocket.WebSocketSession;
import io.micronaut.websocket.annotation.OnMessage;
import io.micronaut.websocket.annotation.ServerWebSocket;

import java.util.List;

@ServerWebSocket("/reactive/get/smth")
public class WebSocketServer {

    @OnMessage
    public void onMessage(List<ConfigurationItem> items, WebSocketSession session) {
        System.out.println(items);
        session.sendSync("Well done");
    }
}
