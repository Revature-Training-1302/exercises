package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd()
    {
        assertEquals( 8,  calculator.add(5, 3));
    }

    @Test
    public void testSubtract()
    {
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    public void testMultiply()
    {
        assertEquals(15, calculator.multiply(5, 3));
    }

    @Test
    public void testDivide()
    {
        assertEquals(12/3 , calculator.divide(12, 3));
    }


    @Test
    public void testIsEvenWithOdd()
    {
        if(5 % 2 == 0)
            assertEquals(true, calculator.isEven(5));
        else
            assertEquals(false, calculator.isEven(5));
    }

    @Test
    public void testIsEvenWithEven()
    {
        if(6 % 2 == 0)
            assertEquals(true, calculator.isEven(6));
        else
            assertEquals(false, calculator.isEven(6));
    }

    @Test
    public void testIsOddWithEven()
    {
        if( 22% 2 == 1)
            assertEquals(true, calculator.isOdd(22));
        else
            assertEquals(false, calculator.isOdd(22));
    }

    @Test
    public void testIsOddWithOdd()
    {
        if( 9% 2 == 1)
            assertEquals(true, calculator.isOdd(9));
        else
            assertEquals(false, calculator.isOdd(9));
    }

}
