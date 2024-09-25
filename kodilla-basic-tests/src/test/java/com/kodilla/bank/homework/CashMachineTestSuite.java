package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {


    @Test
    public void addingDepo(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(100.50);
        assertEquals(100.50, cashMachine.getBalance(),0.01);
    }
    @Test
    public void testAddingWith() {
        CashMachine cashmMachine = new CashMachine();
        cashmMachine.addTransaction(-100.50);
        assertEquals(-100.50, cashmMachine.getBalance());

    }
    @Test
    public void testAddingDepo() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(100.5);
        assertEquals(100.5, cashMachine.getBalance());
    }
    @Test
    public void testAddingZero(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(0.0);
        assertEquals(0.0, cashMachine.getBalance());
    }

    @Test
    public void TestGetAverageWithdrawAndDepo() {

        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(100.5);
        cashMachine.addTransaction(-200.5);
        cashMachine.addTransaction(-100.5);
        cashMachine.addTransaction(5500.5);
        cashMachine.addTransaction(300.5);

        double averageWithdraw = cashMachine.getAverageWithdraw();
        assertEquals(-274.0, averageWithdraw, 0.001);
        double averageDepo = cashMachine.getAverageDepo();
        assertEquals(5266, averageDepo, 0.001);

    }
    @Test
    public void testIfZeroForDepoAverage(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(-100);
        double averageDepo = cashMachine.getAverageDepo();
        assertEquals(0.00, averageDepo, 0.01);
    }
    @Test
    public void testIfZeroForWithAverage(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(300.0);
        double averageWith = cashMachine.getAverageWithdraw();
        assertEquals(0, averageWith, 0.01);
    }

}
