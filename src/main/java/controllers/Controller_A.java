package controllers;

import com.example.Cv01.Greeting;
import org.springframework.stereotype.Controller;

@Controller
public class Controller_A {

    private final Greeting greetingService;

    public Controller_A() {
        greetingService = new Greeting();
    }

    public String greetingA() {
        return greetingService.sayGreeting();
    }

}
