package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public static void addTestThreePlusFourEqualSeven(int i, int i1) {
        Calculator calculator=new Calculator();

        assertEquals(7,calculator.add(3, 4));
    }
    public static void subtractTestSevenMinFiveEqualTwo(int a, int b){
        Calculator calculator=new Calculator();
        assertEquals(2,calculator.subtract(7,5));

    }

    public static void multTestSevenMultTwoEqualFourteen(int a,int b) {
        Calculator calculator=new Calculator();
        assertEquals(14,calculator.multiply(7,2));
    }
    public static void divideTestEightDivTwoEqualFour(int a, int b){
        Calculator calculator=new Calculator();
        assertEquals(4,calculator.divide(8,2));
    }
    public static void isEvenTestGiveSixReturnTrue(int a){
        Calculator calculator=new Calculator();
        assertEquals(true,calculator.isEven(6));

    }
    public static void isOddTestGiveFiveReturnFalse(int a){
        Calculator calculator=new Calculator();
        assertEquals(false,calculator.isEven(5));

    }
//
    }


