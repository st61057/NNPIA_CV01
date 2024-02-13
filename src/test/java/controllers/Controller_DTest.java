package controllers;

import com.example.Cv01.Greeting;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Controller_DTest {

    Controller_D controllerD;

    @BeforeEach
    void setUp() {
        controllerD = new Controller_D();
        controllerD.setGreetingService(new Greeting());
    }

    @Test
    void greetingD() {
        System.out.println(controllerD.greetingD());
    }
}