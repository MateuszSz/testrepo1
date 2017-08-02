package com.example.demo.controller;

import com.example.demo.model.Topic;
import com.example.demo.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloRestController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/hello")
    public List<Topic> sayHello(){

        Topic topic = new Topic(1,"ala ma kota");
        topicService.addTopic(topic);
        Topic topic1 = new Topic(2,"ala ma kota1");
        topicService.addTopic(topic1);
        Topic topic2 = new Topic(3,"ala ma kota2");
        topicService.addTopic(topic2);
        Topic topic3 = new Topic(4,"ala ma kota3");
        topicService.addTopic(topic3);
        return topicService.getAllTopics();
    }
}
