package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double a = 3;
        double b = 4;
        double sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(11, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }
        double subResult = calculator.sub(a, b);
        boolean correctSub = ResultChecker.assertEquals(3, subResult);
        if (correctSub){
            System.out.println("Poprawne odejmowanie");
        } else {
            System.out.println("Niepoprawne odejmowanie");
        }
        double squareResult = calculator.square(a, b);
        System.out.println("Wynik potęgowania " + squareResult);
        boolean correctSquare = ResultChecker.assertEquals(36, squareResult);
        if (correctSquare) {
            System.out.println("Poprawne potęgowanie");
        } else {
            System.out.println("Niepoprawne potęgowanie");
        }
    }
}

