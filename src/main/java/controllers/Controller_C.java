package controllers;

import com.example.Cv01.Greeting;

public class Controller_C {
    Greeting greetingService;

    public String greetingC(){
        return greetingService.sayGreeting();
    }

}
