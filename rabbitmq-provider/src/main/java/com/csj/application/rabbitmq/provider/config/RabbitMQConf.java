package com.csj.application.rabbitmq.provider.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConf {

    @Bean
    public Queue paymentNotifyQueue() {
        return new Queue("queue");
    }

}
