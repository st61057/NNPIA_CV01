package com.example.Cv01.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Controller_BTest {

    @Autowired
    Controller_B controllerB;

    @Test
    void testControllerB() {
        System.out.println(controllerB.greetingB());
    }
}
