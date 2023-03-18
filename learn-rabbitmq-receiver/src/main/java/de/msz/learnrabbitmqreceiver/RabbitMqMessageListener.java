package de.msz.learnrabbitmqreceiver;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMqMessageListener {

    @RabbitListener(queues = "RoutedQueue")
    public void onMessage(Message message) {
        System.out.println("message = " + new String(message.getBody()));
    }
}
