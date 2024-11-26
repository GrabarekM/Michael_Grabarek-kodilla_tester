//package com.kodilla.bank.homework;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class BankTestSuite {
//
//
//    @Test
//    public void testTotalEmptyBank() {
//        Bank bank = new Bank();
//        double bankBalance = bank.getTotalBalance();
//        assertEquals(0.0, bankBalance, 0.01);
//    }
//    @Test
//    public void testTotalCountWithEmptyBank() {
//        Bank bank = new Bank();
//        int count = bank.getNumberOfWithsForCashMachines();
//        assertEquals(0, count);
//    }
//
//    @Test
//    public void testTotalDeposEmptyBank() {
//        Bank bank = new Bank();
//        int count = bank.getNumberOfDeposForCashMachines();
//        assertEquals(0, count);
//    }
//    @Test
//    public void testTotalSumInCashMachines() {
//        Bank bank = new Bank();
//        CashMachine cashMachine1 = new CashMachine();
//        CashMachine cashMachine2 = new CashMachine();
//        CashMachine cashMachine3 = new CashMachine();
//
//        cashMachine1.addTransaction(-400);
//        cashMachine1.addTransaction(600);
//        cashMachine2.addTransaction(-1244);
//        cashMachine2.addTransaction(132);
//        cashMachine3.addTransaction(5555);
//        cashMachine3.addTransaction(5000);
//        cashMachine3.addTransaction(-4506);
//        cashMachine3.addTransaction(1430);
//
//        bank.addCashMachine(cashMachine1);
//        bank.addCashMachine(cashMachine2);
//        bank.addCashMachine(cashMachine3);
//
//        double bankBalance = bank.getTotalBalance();
//        assertEquals(6567.0, bankBalance, 0.01);
//    }
//    @Test
//    public void testTotalCountwith() {
//        Bank bank = new Bank();
//        CashMachine cashMachine1 = new CashMachine();
//        CashMachine cashMachine2 = new CashMachine();
//        CashMachine cashMachine3 = new CashMachine();
//
//        cashMachine1.addTransaction(-400);
//        cashMachine1.addTransaction(600);
//        cashMachine2.addTransaction(-1244);
//        cashMachine2.addTransaction(132);
//        cashMachine3.addTransaction(5555);
//        cashMachine3.addTransaction(5000);
//        cashMachine3.addTransaction(-4506);
//        cashMachine3.addTransaction(1430);
//
//        bank.addCashMachine(cashMachine1);
//        bank.addCashMachine(cashMachine2);
//        bank.addCashMachine(cashMachine3);
//
//        int count = bank.getNumberOfWithsForCashMachines();
//        assertEquals(4, count, 0.01);
//
//    }
//    @Test
//    public void testTotalCountdepo() {
//        Bank bank = new Bank();
//        CashMachine cashMachine1 = new CashMachine();
//        CashMachine cashMachine2 = new CashMachine();
//        CashMachine cashMachine3 = new CashMachine();
//
//        cashMachine1.addTransaction(-400);
//        cashMachine1.addTransaction(600);
//        cashMachine2.addTransaction(-1244);
//        cashMachine2.addTransaction(132);
//        cashMachine3.addTransaction(5555);
//        cashMachine3.addTransaction(5000);
//        cashMachine3.addTransaction(-4506);
//        cashMachine3.addTransaction(1430);
//
//        bank.addCashMachine(cashMachine1);
//        bank.addCashMachine(cashMachine2);
//        bank.addCashMachine(cashMachine3);
//
//        int count = bank.getNumberOfDeposForCashMachines();
//        assertEquals(4, count, 0.01);
//
//    }
//    @Test
//    public void testTotalAverageWithdraw() {
//        Bank bank = new Bank();
//        CashMachine cashMachine1 = new CashMachine();
//        CashMachine cashMachine2 = new CashMachine();
//        CashMachine cashMachine3 = new CashMachine();
//
//        cashMachine1.addTransaction(-400);
//        cashMachine1.addTransaction(600);
//        cashMachine2.addTransaction(-1244);
//        cashMachine2.addTransaction(132);
//        cashMachine3.addTransaction(5555);
//        cashMachine3.addTransaction(5000);
//        cashMachine3.addTransaction(-4506);
//        cashMachine3.addTransaction(1430);
//
//        bank.addCashMachine(cashMachine1);
//        bank.addCashMachine(cashMachine2);
//        bank.addCashMachine(cashMachine3);
//
//       double average = bank.getAverageOfWithCashMachines();
//        assertEquals(4, average, 0.01);
//
//    }
//    @Test
//    public void testTotalAveragedeposits() {
//        Bank bank = new Bank();
//        CashMachine cashMachine1 = new CashMachine();
//        CashMachine cashMachine2 = new CashMachine();
//        CashMachine cashMachine3 = new CashMachine();
//
//        cashMachine1.addTransaction(-400);
//        cashMachine1.addTransaction(600);
//        cashMachine2.addTransaction(-1244);
//        cashMachine2.addTransaction(132);
//        cashMachine3.addTransaction(5555);
//        cashMachine3.addTransaction(5000);
//        cashMachine3.addTransaction(-4506);
//        cashMachine3.addTransaction(1430);
//
//        bank.addCashMachine(cashMachine1);
//        bank.addCashMachine(cashMachine2);
//        bank.addCashMachine(cashMachine3);
//
//        double average = bank.getAverageOfDepoCashMachines();
//        assertEquals(4, average, 0.01);
//
//    }
//
//}
