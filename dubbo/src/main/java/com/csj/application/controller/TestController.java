package com.csj.application.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.csj.application.dubbo.IHelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Reference(check = false)
    IHelloService iHelloService;

    @GetMapping("/sayHello")
    public void sayHello() {
        System.out.println("========================");
        iHelloService.sayHello();
    }
}
