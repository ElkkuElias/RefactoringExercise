package org.example;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Executable;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
@Test
    public void testAddTwoNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.addTwoNumbers(10, 20);
        assertEquals(30, result);
    }

    @Test
    public void testSubtractTwoNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.subtractTwoNumbers(20, 10);
        assertEquals(10, result);
    }

    @Test
    public void testMultiplyTwoNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.multiplyTwoNumbers(10, 20);
        assertEquals(200, result);
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(20, 10);
        assertEquals(2, result);
    }

    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(20, 0);
        });
    }

    @Test
    public void testCheckForZero() {
        Calculator calculator = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.checkForZero(0);
        });
    }
}