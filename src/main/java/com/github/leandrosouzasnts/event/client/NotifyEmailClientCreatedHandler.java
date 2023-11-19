package com.github.leandrosouzasnts.event.client;

public class NotifyEmailClientCreatedHandler implements ClientCreatedHandler {

    @Override
    public void handleClientCreated(ClientCreatedEvent event) {
        // TODO Auto-generated method stub
        
        String mensagem = "Hi, a new created client\n" +
        "Id: " + event.getClientId() + "\n" +
        "Name: " + event.getName() + "\n" +
        "Email: " + event.getEmail();
    
    System.out.println("Email for:" + event.getEmail() + ":\n" + mensagem);
    }
    
}
