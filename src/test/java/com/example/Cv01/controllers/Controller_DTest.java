package com.example.Cv01.controllers;

import com.example.Cv01.services.Greeting;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Controller_DTest {
    @Autowired
    Controller_D controllerD;

    @Test
    void greetingD() {
        System.out.println(controllerD.greetingD());
    }
}