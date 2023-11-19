package com.github.leandrosouzasnts;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

import com.github.leandrosouzasnts.domain.Client;
import com.github.leandrosouzasnts.event.EventDispatcher;
import com.github.leandrosouzasnts.event.client.NotifyEmailClientCreatedHandler;

public class ClientTest {

    @Test
    public void createdClientTest(){
        Client client = new Client(1, "Leandro Souza", "leandro@teste.com.br");

        assertEquals(1, client.getClientId());
    }
    
    @Test 
    public void toCreatedClientEventTest(){
        
        Client client = mock(Client.class);
        
        EventDispatcher eventDispatcher = new EventDispatcher();
        eventDispatcher.register(new NotifyEmailClientCreatedHandler());

        client.toCreatedClient(eventDispatcher);

        verify(client, times(1)).toCreatedClient(eventDispatcher);
    }
}
