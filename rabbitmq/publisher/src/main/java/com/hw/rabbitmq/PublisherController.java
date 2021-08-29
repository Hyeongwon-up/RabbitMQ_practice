package com.hw.rabbitmq;


import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
public class PublisherController {
    private static final String EXCHANGE_NAME = "sample.exchange";
    private final RabbitTemplate rabbitTemplate;

    @GetMapping("/sample/queue")
    public String samplePublish(){
        rabbitTemplate.convertAndSend(EXCHANGE_NAME, "sample.key.#", "RabbitMQ Sucess!!");
        return "Message Sending";
    }
}
