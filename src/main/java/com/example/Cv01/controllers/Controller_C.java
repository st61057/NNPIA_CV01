package com.example.Cv01.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.example.Cv01.services.Greeting;

@Controller
public class Controller_C {
    @Autowired
    public Greeting greetingService;

    public String greetingC(){
        return greetingService.sayGreeting();
    }

}
