package com.example.ktpm_tuan05.activeMQ;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import java.util.Map;

@Component
public class Producer {
    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendMessage(String queueName, final String message) {
//        Map map = new Gson().fromJson(message, Map.class);
//        final String textMessage = "Chào nhé " + map.get("name");
        System.err.println(">>>>>>>>>>>>>>>>> Gửi tin nhắn " + message + " đến queue - " + queueName);
        jmsTemplate.send(queueName, new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(message);
            }
        });
    }
}
