package com.example.demo.controllers;
import com.example.demo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import java.util.List;

@ShellComponent
public class MesaageController {

    @Autowired
    private MessageService messageService;

    @ShellMethod("Sent Message")
    public void sentMessage(String message){
        messageService.sentMessage(message);
    }

    @ShellMethod("Print message")
    public void printMessage(){
        List<String> messages = messageService.getMessages();
        messages.forEach(System.out::println);
    }




}
