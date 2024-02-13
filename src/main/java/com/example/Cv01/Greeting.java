package com.example.Cv01;

import services.GreetingService;

public class Greeting implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Greetings controller";
    }
}
