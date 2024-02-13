package com.example.Cv01.controllers;

import com.example.Cv01.controllers.Controller_A;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Controller_ATest {
    Controller_A controllerA;
    @BeforeEach
    void setUp() {
        controllerA = new Controller_A();
    }

    @Test
    void testControllerA() {
        System.out.println(controllerA.greetingA());
    }

}
