package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class notStatic {
    static Calculator calculator;

    @BeforeAll
    public static void setUp() {
        // because out counter is static and being shared by all tests, the value isn't being reset every time
        notStatic.calculator = new Calculator();
    }

    @AfterAll
    public static void cleanUp() {
        System.out.println("This should run after all of the tests");
    }

    @AfterEach
    public void endTest() {
        System.out.println("This should run after each test.");
    }
}
