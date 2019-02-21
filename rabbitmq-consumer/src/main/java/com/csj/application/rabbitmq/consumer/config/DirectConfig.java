package com.csj.application.rabbitmq.consumer.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DirectConfig {

    @Bean
    public Queue paymentNotifyQueue() {
        return new Queue("queue");
    }
}
