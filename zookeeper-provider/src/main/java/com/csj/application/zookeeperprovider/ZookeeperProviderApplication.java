package com.csj.application.zookeeperprovider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableDiscoveryClient
public class ZookeeperProviderApplication {


    @Autowired
    private DiscoveryClient discovery;

    @Autowired(required = false)
    private Registration registration;


    @RequestMapping("/hi")
    public String hi() {
        return "Hello World! from " + this.registration;
    }


    public static void main(String[] args) {
        SpringApplication.run(ZookeeperProviderApplication.class, args);
    }


}
