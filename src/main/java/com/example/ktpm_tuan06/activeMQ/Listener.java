package com.example.ktpm_tuan06.activeMQ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;

@Component
public class Listener {
    @Autowired
    private Producer producer;

//    @JmsListener(destination = "inbound.queue")
    @JmsListener(destination = "Hieu")
    public void receiveMessage(Message jsonMessage) throws JMSException {
        String messageData = null;
        if(jsonMessage instanceof TextMessage) {
            TextMessage textMessage = (TextMessage)jsonMessage;
            messageData = textMessage.getText();
        }

        System.err.println(">>>>>>>>>>>>>>>>> Nhận tin nhắn: " + messageData);
//
//        producer.sendMessage("outbound.queue", messageData);
    }
}
