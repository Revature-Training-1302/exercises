package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public static void test() {
        assertEquals(1, 1);
    }
    @Test
    public static void test1(int a, int b){
        Calculator calculator = new Calculator();
        assertEquals(7, calculator.add(3,4));
    }
    @Test
    public static  void test2(int a, int b){
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.subtract(20,10));
    }
    @Test
    public static void test3(int a, int b){
        Calculator calculator = new Calculator();
        assertEquals(25, calculator.multiply(5, 5));
        assertEquals(25, calculator.divide(625, 25));
    }
    @Test
    public static void test4(int a, int b){
        Calculator calculator = new Calculator();
        assertEquals(25, calculator.divide(625, 25));
    }
    @Test
    public static void test5(int a){
        Calculator calculator = new Calculator();
        assertEquals(25, calculator.isEven(5));
    }
    @Test
    public static void test6(int a){
        Calculator calculator= new Calculator();
        assertEquals(100, calculator.isOdd(10));
    }


}
