package com.abhi.messagingserverconfig.controller;

import com.abhi.messagingserverconfig.config.Consumer;
import com.abhi.messagingserverconfig.config.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MessageConfigController {

    @Autowired
    private Producer producer;

    @Autowired
    private Consumer consumer;


    @GetMapping(path = "/message-config/produce")
    public void sendMessage(){
        Map<String, String> actionmap = new HashMap<>();
        actionmap.put("to","vipin.chaudhary@globallogic.com");
        actionmap.put("from","abhishek.raj1@globallogic.com");
        actionmap.put("cc","abc@globallogic.com");
        actionmap.put("bcc","abhic@globallogic.com");
        System.out.println("request process");
        producer.sendMessage("test", actionmap);
    }

    @GetMapping(path = "/message-config/consume")
    public Object consumerMessage(){
        return  this.consumer.consumer("test");
    }

}
