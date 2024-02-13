package com.example.Cv01.controllers;

import com.example.Cv01.services.Greeting;
import org.springframework.stereotype.Controller;

@Controller
public class Controller_A {

    public String greetingA() {
        Greeting greetingService = new Greeting();
        return greetingService.sayGreeting();
    }

}
