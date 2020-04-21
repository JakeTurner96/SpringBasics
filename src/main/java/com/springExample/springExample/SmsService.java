package com.springExample.springExample;

import org.springframework.stereotype.Component;

@Component
public class SmsService implements MessageService {
    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println("\nSMS sent to: " + recipient + "\nSMS content: " + message);
    }
}
