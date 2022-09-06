package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {


//import static org.junit.jupiter.api.Assertions.*;


    @Test
    public void addTestThreePlusFourEqualSeven() {
        Calculator calculator = new Calculator();

        assertEquals(7, calculator.add(3, 4));
    }


    @Test
    public void subtractTestSevenMinFiveEqualTwo() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.subtract(7, 5));

    }

    @Test
    public void multTestSevenMultTwoEqualFourteen() {
        Calculator calculator = new Calculator();
        assertEquals(14, calculator.multiply(7, 2));
    }

    @Test
    public void divideTestEightDivTwoEqualFour() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.divide(8, 2));
    }

    @Test
    public void isEvenTestGiveSixReturnTrue() {
        Calculator calculator = new Calculator();
        assertEquals(true, calculator.isEven(6));

    }

    @Test
    public void isEvenTestGiveFiveReturnFalse() {
        Calculator calculator = new Calculator();
        assertEquals(false, calculator.isEven(5));

    }

    @Test
    public void isOddTestGiveFiveReturnTrue() {
        Calculator calculator = new Calculator();
        assertEquals(true, calculator.isOdd(5));

    }
    @Test
    public void isOddTestGiveSixReturnFalse() {
        Calculator calculator = new Calculator();
        assertEquals(false, calculator.isOdd(6));

    }
}