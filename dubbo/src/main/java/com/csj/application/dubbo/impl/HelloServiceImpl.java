package com.csj.application.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.csj.application.dubbo.IHelloService;
import org.springframework.stereotype.Component;

@Service
@Component
public class HelloServiceImpl implements IHelloService {

    @Override
    public void sayHello() {
        System.out.println("hello dubbo");
    }
}
