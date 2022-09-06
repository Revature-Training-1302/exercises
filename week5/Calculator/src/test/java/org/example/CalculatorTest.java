package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void addTest() {

        assertEquals(6,calculator.add(3,3));

    }

    @Test
    public void subTest() {

        assertEquals(0,calculator.subtract(3,3));

    }

    @Test
    public void mulTest() {

        assertEquals(9,calculator.multiply(3,3));

    }

    @Test
    public void divideTest() {

        assertEquals(1,calculator.divide(3,3));
    }

    @Test
    public void evenTest() {

        assertEquals(true,calculator.isEven(2));
    }


    @Test
    public void oddTest() {

        assertEquals(true,calculator.isOdd(3));
    }
}
