package controllers;

import com.example.Cv01.Greeting;
import org.springframework.stereotype.Controller;

@Controller
public class Controller_B {
    private final Greeting greetingService;

    public Controller_B(Greeting greetingService) {
        this.greetingService = greetingService;
    }
    public String greetingB(){
        return greetingService.sayGreeting();
    }
}
