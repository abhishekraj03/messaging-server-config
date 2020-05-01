package com.abhi.messagingserverconfig.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class Producer {

    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendMessage(String topicName, Map<String, String> actionmap ){

        jmsTemplate.convertAndSend(topicName,actionmap);
        System.out.println("message send");
    }
}


//spring cloud config
//falt tolerance
//config

