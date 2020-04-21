package com.springExample.springExample;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements MessageService {
    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println("\nEmail sent to: " + recipient + "\nEmail content: " + message);
    }
}
