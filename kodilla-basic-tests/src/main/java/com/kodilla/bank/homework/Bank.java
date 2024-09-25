package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;
    private int size;

    public Bank() {
        this.size = 0;
        this.cashMachines = new CashMachine[0];
    }
public void addCashMachine(CashMachine cashMachine) {
        this.size++;
        CashMachine[] newCashMachines = new CashMachine[this.size];
        System.arraycopy(cashMachines,0, newCashMachines,0, cashMachines.length);
        newCashMachines[this.size - 1] = cashMachine;
        this.cashMachines = newCashMachines;
}
public double getTotalBalance() {
        double totalBalance = 0;
        int counter = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalBalance = totalBalance + cashMachines[i].getBalance();
        }
        return totalBalance;
}
public int getNumberOfDeposForCashMachines() {
        int counter = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            counter = counter + cashMachines[i].getHowManyDeposit();
            }
        return counter;
    }
    public int getNumberOfWithsForCashMachines() {
        int counter = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            counter = counter + cashMachines[i].getHowManyWithdrawal();
            }
        return counter;
    }
    public double getAverageOfDepoCashMachines() {
      double totalAverage = 0;
      int counter = 0;
      for (int i = 0; i < cashMachines.length; i++) {
              counter = counter + getNumberOfDeposForCashMachines();
              totalAverage = totalAverage + (getNumberOfDeposForCashMachines() * getAverageOfDepoCashMachines());
          }

      if (counter == 0) {
          return 0;
        }
        return totalAverage / counter;
    }
    public double getAverageOfWithCashMachines() {
        double totalAverage = 0;
        int counter = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            counter = counter + getNumberOfWithsForCashMachines();
            totalAverage = totalAverage + (getAverageOfWithCashMachines() * getNumberOfWithsForCashMachines());
        }
        if (counter == 0) {
            return 0;
        }
        return totalAverage / counter;
    }






}
