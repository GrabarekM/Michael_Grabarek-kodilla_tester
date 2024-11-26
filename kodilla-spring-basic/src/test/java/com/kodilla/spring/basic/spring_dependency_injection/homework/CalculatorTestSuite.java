//package com.kodilla.spring.basic.spring_dependency_injection.homework;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//
//@SpringBootTest
//public class CalculatorTestSuite {
//
//    @Autowired
//    private Calculator calculator;
//
//    @Autowired
//    private Display display;
//
//    @BeforeEach
//    void setUp() {
//        this.display = Mockito.mock(Display.class);
//        this.calculator = new Calculator(display);
//    }
//
//    @Test
//    public void testAdd() {
//        double result = calculator.add(5, 3);
//        assertEquals(8, result);
//        Mockito.verify(display).display(8);
//    }
//
//    @Test
//    public void testSubtract() {
//        double result = calculator.subtract(10, 4);
//        assertEquals(6, result);
//        Mockito.verify(display).display(6);
//    }
//
//    @Test
//    public void testMultiply() {
//        double result = calculator.multiply(2, 3);
//        assertEquals(6, result);
//        Mockito.verify(display).display(6);
//    }
//
//    @Test
//    public void testDivide() {
//        double result = calculator.divide(10, 2);
//        assertEquals(5, result);
//        Mockito.verify(display).display(5);
//    }
//
//    @Test
//    public void testDivideByZero() {
//        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
//    }
//}