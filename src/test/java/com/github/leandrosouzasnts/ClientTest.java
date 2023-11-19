package com.github.leandrosouzasnts;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.github.leandrosouzasnts.domain.Client;

public class ClientTest {

    @Test
    public void createdClientTest(){
        Client client = new Client(1, "Leandro Souza", "leandro@teste.com.br");

        assertEquals(1, client.getClientId());
    }
    
}
