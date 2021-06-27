package com.tutrit.java.quickstart.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorServiceTest {

    CalculatorService calculatorService;


    @Before
    public void setUp() {
        calculatorService = new CalculatorService();

    }

    @Test
    public void sumPositive() {
        int a = 10;
        int b = 15;
        int expected = 25;
        int actual = calculatorService.sum(a, b);
        assertEquals(expected, actual);
    }

    @Test
    public void sumNegative() {
        int a = 10;
        int b = 15;
        int expected = 23;
        int actual = calculatorService.sum(a, b);
        assertNotEquals(expected, actual);
    }

    @Test
    public void subPositive() {
        int a = 10;
        int b = 15;
        int expected = -5;
        int actual = calculatorService.sub(a, b);
        assertEquals(expected, actual);
    }

    @Test
    public void subNegative() {
        int a = 10;
        int b = 15;
        int expected = 0;
        int actual = calculatorService.sum(a, b);
        assertNotEquals(expected, actual);
    }

    @Test
    public void divPositive() {
        int a = 45;
        int b = 15;
        int expected = 3;
        int actual = calculatorService.div(a, b);
        assertEquals(expected, actual);
    }

    @Test
    public void divNegative() {
        int a = 45;
        int b = 15;
        int expected = 0;
        int actual = calculatorService.sum(a, b);
        assertNotEquals(expected, actual);
    }

    @Test(expected = ArithmeticException.class)
    public void divBy0() {
        int a = 45;
        int b = 0;
        int actual = calculatorService.div(a, b);
    }

    @Test
    public void multiplicationPositive() {
        int a = 10;
        int b = 15;
        int expected = 150;
        int actual = calculatorService.multiplication(a, b);
        assertEquals(expected, actual);
    }

    @Test
    public void multiplicationNegative() {
        int a = 10;
        int b = 15;
        int expected = 125;
        int actual = calculatorService.multiplication(a, b);
        assertNotEquals(expected, actual);
    }
}
