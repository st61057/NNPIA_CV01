package controllers;

import com.example.Cv01.Greeting;

public class Controller_D {

    private Greeting greetingService;

    public void setGreetingService(Greeting greetingService){
        this.greetingService = greetingService;
    }

    public String greetingD(){
        return greetingService.sayGreeting();
    }
}
