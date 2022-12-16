package org.bedu.springjms.listener;

import jakarta.jms.Message;
import org.bedu.springjms.config.JmsConfig;
import org.bedu.springjms.model.GreetingMessage;
import org.springframework.jms.annotation.JmsListener;

import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

// Annotation
@Component
public class MessageListener {
    @JmsListener(destination = JmsConfig.QUEUE)

    public void
    listen(@Payload GreetingMessage greetingMessage,
           @Headers MessageHeaders messageHeaders,
           Message message)
    {

        // Display command
        System.out.println("Greeting Received!!!");

        System.out.println(greetingMessage);
    }
}
