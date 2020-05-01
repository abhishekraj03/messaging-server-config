package com.abhi.messagingserverconfig.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
    @Autowired
    private JmsTemplate jmsTemplate;

    public Object consumer(String topicName){
        return jmsTemplate.receiveAndConvert(topicName);
    }
}
