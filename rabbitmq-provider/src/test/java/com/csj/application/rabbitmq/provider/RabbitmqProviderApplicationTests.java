package com.csj.application.rabbitmq.provider;

import com.csj.application.rabbitmq.provider.controller.TestController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitmqProviderApplicationTests {

	@Autowired
	private TestController testController;

	@Test
	public void test_sender() {
		testController.sender("支付订单号："+System.currentTimeMillis());
	}

}
