package com.github.leandrosouzasnts;

import com.github.leandrosouzasnts.domain.Client;
import com.github.leandrosouzasnts.event.EventDispatcher;
import com.github.leandrosouzasnts.event.client.ClientCreatedEvent;
import com.github.leandrosouzasnts.event.client.NotifyEmailClientCreatedHandler;

public class Main 
{
    public static void main( String[] args )
    {
        Client client = new Client(1, "Leandro Souza", "leandro@teste.com.br");

        ClientCreatedEvent  event = new ClientCreatedEvent(client.getClientId(), client.getName(), client.getEmail());

        EventDispatcher.register(new NotifyEmailClientCreatedHandler());

        EventDispatcher.notify(event);
    }
}
