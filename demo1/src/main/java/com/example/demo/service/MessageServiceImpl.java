package com.example.demo.service;

import com.example.demo.repository.MessageStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageStore messageStore;

    public void sentMessage(String message){
        messageStore.addMessage(message);
        System.out.println(message);
    }

    public List<String> getMessages(){
        return this.messageStore.getMessage();
    }

}
