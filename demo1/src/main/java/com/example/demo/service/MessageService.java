package com.example.demo.service;

import java.util.List;

public interface MessageService {

    void sentMessage(String message);

    List<String> getMessages();


}
