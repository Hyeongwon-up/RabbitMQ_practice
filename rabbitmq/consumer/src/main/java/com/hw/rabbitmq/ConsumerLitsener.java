package com.hw.rabbitmq;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerLitsener {

    @RabbitListener(queues = "sample.queue")
    public void receiveMessage(final Message message){
        System.out.println("@#@#!#!@#!@#!#!@#!@#!@#!@#!@#!# 메시지 받음 !@#!@#!@");
        System.out.println(message.toString());
    }

}
