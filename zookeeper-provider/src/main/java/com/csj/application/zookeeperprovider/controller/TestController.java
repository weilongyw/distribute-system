package com.csj.application.zookeeperprovider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    @RequestMapping("/hello")
    public Map<String, String> home() {
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "zhangsan");
        return map;
    }
}
