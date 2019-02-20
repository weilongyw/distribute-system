package com.csj.application.redis;

import com.csj.application.redis.service.RedisService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisApplicationTests {

    @Autowired
    RedisService redisService;

    @Test
    public void contextLoads() {
        redisService.set("name", "zhangsan");
        System.out.println(redisService.get("name"));
    }

}
