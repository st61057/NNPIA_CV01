package com.example.Cv01.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.example.Cv01.services.Greeting;

@Controller
public class Controller_D {

    private Greeting greetingService;

    @Autowired
    public void setGreetingService(Greeting greetingService){
        this.greetingService = greetingService;
    }

    public String greetingD(){
        return greetingService.sayGreeting();
    }
}
