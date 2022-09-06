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
    public void testAdd() {
        assertEquals(23, calculator.add(10, 13));
    }

    @Test
    public void testSubtact() {
        assertEquals(-3, calculator.subtract(10, 13));
    }

    @Test
    public void testMultiply() {
        assertEquals(130, calculator.multiply(10, 13));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calculator.divide(26, 13));
    }

    @Test
    public void testIsEven() {
        assertEquals(false, calculator.isEven( 13));
    }

    @Test
    public void testIsOdd() {
        assertEquals(true, calculator.isOdd( 13));
    }


}
