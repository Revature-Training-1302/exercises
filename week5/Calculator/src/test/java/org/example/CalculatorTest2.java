package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest2 {
    int a = 3;
    int b = 2;




    @Test
    public void addTest(){
        Calculator calculator = new Calculator();

        assertEquals(5, calculator.add(a, b) );

    }
@Test
    public void subtractTest(){
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(a,b));


    }
    @Test
    public void multiplyTest(){
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(a,b));
    }
    @Test
    public void divideTest(){
        Calculator calculator = new Calculator();
        assertEquals(3/2, calculator.divide(a,b));
    }
    @Test
    public void isEvenTest1(){
        Calculator calculator = new Calculator();
        calculator.isEven(a);
    }
    @Test
    public void isEvenTest2(){
        Calculator calculator = new Calculator();
        calculator.isEven(a+1);
    }
    @Test
    public void isOddTest1(){
        Calculator calculator = new Calculator();
        calculator.isOdd(a);
    }
    @Test
    public void isOddtest2(){
        Calculator calculator = new Calculator();
        calculator.isOdd(a+1);
    }
}
