package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    public void testAdd(){
        assertEquals(4,calculator.add(1,3));
    }
    @Test
    public void testSubtraction(){
        assertEquals(2,calculator.subtract(4,2));
    }
    @Test
    public void testMultiplay(){
        assertEquals(4,calculator.multiply(2,2));
    }
    @Test
    public void testDivide(){
        assertEquals(2,calculator.divide(4,2));
    }
    @Test
    public void testIsEven(){
        assertEquals(true,calculator.isEven(2));
        assertEquals(false,calculator.isEven(7));
    }
    @Test
    public void testIsOdd(){
        assertEquals(true,calculator.isOdd(5));
        assertEquals(false,calculator.isOdd(8));
    }
}
