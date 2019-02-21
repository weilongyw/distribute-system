package com.csj.application.rabbitmq.provider.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @RequestMapping("send")
    public void sender(String msg) {
        rabbitTemplate.convertAndSend("queue", msg);
    }

}
