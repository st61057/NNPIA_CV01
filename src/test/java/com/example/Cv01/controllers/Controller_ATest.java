package com.example.Cv01.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Controller_ATest {

    @Autowired
    Controller_A controllerA;

    @Test
    void testControllerA() {
        System.out.println(controllerA.greetingA());
    }

}
