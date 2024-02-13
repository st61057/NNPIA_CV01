package controllers;

import com.example.Cv01.Greeting;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class Controller_CTest {

    Controller_C controllerC;

    @BeforeEach
    void setup(){
        controllerC = new Controller_C();
        controllerC.greetingService = new Greeting();
    }

    @Test
    void greetingC(){
        System.out.println(controllerC.greetingC());
    }

}