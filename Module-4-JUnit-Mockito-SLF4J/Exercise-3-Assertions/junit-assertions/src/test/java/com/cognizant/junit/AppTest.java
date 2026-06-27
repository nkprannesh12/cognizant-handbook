package com.cognizant.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(15, calculator.add(10, 5));
    }

    @Test
    void testSubtract() {
        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    void testMultiply() {
        assertEquals(50, calculator.multiply(10, 5));
    }

    @Test
    void testDivide() {
        assertEquals(2, calculator.divide(10, 5));
    }

    @Test
    void testAssertTrue() {
        assertTrue(10 > 5);
    }

    @Test
    void testAssertFalse() {
        assertFalse(5 > 10);
    }

    @Test
    void testAssertNull() {
        String value = null;
        assertNull(value);
    }

    @Test
    void testAssertNotNull() {
        String value = "Cognizant";
        assertNotNull(value);
    }

    @Test
    void testException() {
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
    }
}