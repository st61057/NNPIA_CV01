package com.example.Cv01.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Controller_CTest {

    @Autowired
    Controller_C controllerC;

    @Test
    void greetingC(){
        System.out.println(controllerC.greetingC());
    }

}