package com.kodilla.bank.homework;

public class CashMachine {

    private double[] transactions;
    private int size;

    public CashMachine(){
        this.transactions = new double[0];
        this.size = 0;
    }
    public void addTransaction(double value) {
        if (value == 0){
            return;
        }
        size++;
        double[] newTransaction = new double[size];
        System.arraycopy(transactions, 0, newTransaction,0, transactions.length);
        newTransaction[this.size - 1] = value;
        this.transactions = newTransaction;
    }
    public double getBalance() {
        double balance = 0;
        for (int i = 0; i < transactions.length; i++) {
            balance = balance + transactions[i];
        }
        return balance;
    }
    public int getHowManyTransaction() {
        return this.size;
    }
    public int getHowManyWithdrawal() {
        int counter = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] < 0) {
                counter++;
            }
        }
        return counter;
    }
    public int getHowManyDeposit() {
        int counter = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] > 0) {
                counter++;
            }
        }
        return counter;
    }
    public double getAverageWithdraw() {
        double averageW = 0;
        int counter = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] < 0) {
                counter++;
                averageW = averageW + transactions[i];
            }
        }
        if (counter == 0) {
            return 0;
        }
        return Math.round(averageW / counter * 10) / 10;

    }
    public double getAverageDepo() {
        double totalDeposits = 0;
        int counter = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] > 0) {
                counter++;
                totalDeposits = totalDeposits + transactions[i];
            }
        }
        if (counter == 0) {
            return 0;
        }
        return Math.round(totalDeposits / counter * 10) / 10;
    }

}
