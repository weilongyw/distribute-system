package com.csj.application.rabbitmq.consumer.listen;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.listener.api.ChannelAwareMessageListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumeListener implements ChannelAwareMessageListener {

    @Override
    @RabbitListener(queues = "queue")
    public void onMessage(Message message, Channel channel) throws Exception {
        try {
            //throw new RuntimeException("===================消费异常");
            //消息的标识，false只确认当前一个消息收到，true确认所有consumer获得的消息
            channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
            //拒绝消息
            //channel.basicReject(message.getMessageProperties().getDeliveryTag(), true);
        } catch (Exception e) {
            e.printStackTrace();
            //ack返回false，并重新回到队列，api里面解释得很清楚
            channel.basicNack(message.getMessageProperties().getDeliveryTag(), false, true);
        }

    }

}
