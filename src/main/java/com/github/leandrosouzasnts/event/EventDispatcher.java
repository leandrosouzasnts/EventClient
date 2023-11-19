package com.github.leandrosouzasnts.event;

import java.util.ArrayList;
import java.util.List;

import com.github.leandrosouzasnts.event.client.ClientCreatedEvent;
import com.github.leandrosouzasnts.event.client.ClientCreatedHandler;

public class EventDispatcher {

    public final List<ClientCreatedHandler> listeners;

    public EventDispatcher(){
        this.listeners = new ArrayList<>();
    }

    public void register(ClientCreatedHandler clientCreatedHandler){
        this.listeners.add(clientCreatedHandler);
    }

    public void notify(ClientCreatedEvent event){
        for(ClientCreatedHandler handle : listeners){
            handle.handleClientCreated(event);
        }
    }

}
