package controllers;

import com.example.Cv01.Greeting;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Controller_BTest {

    Controller_B controllerB;
    @BeforeEach
    void setUp() {
        controllerB = new Controller_B(new Greeting());
    }

    @Test
    void testControllerB() {
        System.out.println(controllerB.greetingB());
    }
}
