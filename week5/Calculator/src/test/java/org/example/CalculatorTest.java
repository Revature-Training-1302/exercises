package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.*;

public class CalculatorTest {

    static Calculator calculator;

    @BeforeAll
    public static void setUp() {
        CalculatorTest.calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        int value = calculator.add(2, 5);
        assertEquals(7, value);
    }

    @Test
    public void testSubtract() {
        int value = calculator.subtract(2, 5);
        assertEquals(-3, value);
    }

    @Test
    public void testMultiply() {
        int value = calculator.multiply(2, 5);
        assertEquals(10, value);
    }

    @Test
    public void testDivide() {
        double value = calculator.divide(10, 5);
        assertEquals(2, value);
    }

    @Test
    public void testIsEvenTrue() {
        boolean resultT = calculator.isEven(2);
        assertEquals(true, resultT);

        boolean resultF = calculator.isEven(3);
        assertEquals(false, resultF);
    }

    @Test
    public void testIsOdd() {
        boolean resultT = calculator.isOdd(3);
        assertEquals(true, resultT);

        boolean resultF = calculator.isOdd(2);
        assertEquals(false, resultF);
    }
}
