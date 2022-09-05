package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class CalculatorTest {
    int testingVariable=0;
    double testingVariable2=0;

    public CalculatorTest() {
    }
     Calculator calculator= new Calculator();
    @Test
    public static void test() {
        assertEquals(1, 1);
    }
    @Test
    public void testAdd()
    {
        int testingVariable=calculator.add(1,1);
        Assertions.assertEquals(2, testingVariable);
    }
    @Test
    public void testSubtract()
    {
        int testingVariable=calculator.subtract(3,1);
        Assertions.assertEquals(2, testingVariable);
    }

    @Test
    public void testMultiply()
    {
        int testingVariable=calculator.multiply(3,2);
        Assertions.assertEquals(6, testingVariable);
    }

    @Test
    public void testDivide()
    {
        double testingVariable2=calculator.divide(4,2);
        Assertions.assertEquals(2, testingVariable2);
    }
    @Test
    public void testIsEven()
    {
        boolean isEven;
        if (calculator.add(1,1)%2==0){

            Assertions.assertEquals(1,1);
    }


    }

    @Test
    public void testIsOdd()
    {
        boolean isOdd;
        if (calculator.add(1,2) % 2==0){
            //fail
            Assertions.assertEquals(1,2);
        }
        else
        {
            //true
            Assertions.assertEquals(1,1);

        }

    }






}
