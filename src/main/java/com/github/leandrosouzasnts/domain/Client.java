package com.github.leandrosouzasnts.domain;

import com.github.leandrosouzasnts.event.EventDispatcher;
import com.github.leandrosouzasnts.event.client.ClientCreatedEvent;

public class Client {
    

    private int clientId;
    private String name;
    private String email;

    public Client(int clientId, String name, String email) {
        this.clientId = clientId;
        this.name = name;
        this.email = email;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void toCreatedClient(EventDispatcher eventDispatcher){
        ClientCreatedEvent event = new ClientCreatedEvent(this.clientId, this.name, this.email);   
        eventDispatcher.notify(event);
    }
}
