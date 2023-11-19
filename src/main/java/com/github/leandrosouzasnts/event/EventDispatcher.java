package com.github.leandrosouzasnts.event;

import java.util.ArrayList;
import java.util.List;

import com.github.leandrosouzasnts.event.client.ClientCreatedEvent;
import com.github.leandrosouzasnts.event.client.ClientCreatedHandler;

public class EventDispatcher {
    
    public static List<ClientCreatedHandler> listeners = new ArrayList<>();

    public static void register(ClientCreatedHandler clientCreatedHandler){
        listeners.add(clientCreatedHandler);
    }

    public static void notify(ClientCreatedEvent event){
        for(ClientCreatedHandler handle : listeners){
            handle.handleClientCreated(event);
        }
    }

}
