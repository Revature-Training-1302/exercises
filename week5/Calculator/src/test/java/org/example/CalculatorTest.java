package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator;
    @Test
    public static void test() {
        assertEquals(1, 1);
    }
    @BeforeEach
    public void init() {

        calculator = new Calculator();
    }

    @Test
    public void test1(int a, int b){
        Calculator calculator = new Calculator();
        assertEquals(7, calculator.add(3,4));
    }
    @Test
    public  void test2(int a, int b){
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.subtract(20,10));
    }
    @Test
    public void test3(int a, int b){
        Calculator calculator = new Calculator();
        assertEquals(25, calculator.multiply(5, 5));
        assertEquals(25, calculator.divide(625, 25));
    }
    @Test
    public void test4(int a, int b){
        Calculator calculator = new Calculator();
        assertEquals(25, calculator.divide(625, 25));
    }
    @Test
    public void test5(int a){
        Calculator calculator = new Calculator();
        assertEquals(25, calculator.isEven(5));
    }
    @Test
    public void test6(int a){
        Calculator calculator= new Calculator();
        assertEquals(100, calculator.isOdd(10));
    }


}
