package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    public void init() {
        this.calculator = new Calculator();
    }

    @Test
    public void testAdd(){
        assertEquals(7, calculator.add(4,3));
    }

    @Test
    public void testSubtract(){
        assertEquals(4, calculator.subtract(7,3));
    }

    @Test
    public void testMultiply(){
        assertEquals(21, calculator.multiply(7,3));
    }

    @Test
    public void testDivide(){
        assertEquals(5, calculator.divide(25,5));
    }

    @Test
    public void testIsEven(){
        assertEquals(true, calculator.isEven(4));
    }

    @Test
    public void testIsOdd(){
        assertEquals(true, calculator.isOdd(3));
    }
}
