package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        double a = 5;
        double b = 8;
        double sumResult = calculator.sum(a, b);
        assertEquals(14, sumResult);
    }
    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        double a = 4;
        double b = 3;
        double subResult = calculator.sub(a, b);
        assertEquals(1, subResult);
    }
    @Test
    public void testSquare() {
        Calculator calculator = new Calculator();
        double a = 4;
        double b = 2;
        double squareResult = calculator.square(a, b);
        assertEquals(16, squareResult);
    }

}
