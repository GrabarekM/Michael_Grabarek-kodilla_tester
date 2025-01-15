package com.kodilla.fizzbuzz;

public class FizzBuzzChecker {

    public static String checkFizzBuzz(int number) {
        if (isFizzBuzz(number)) {
            return "FizzBuzz";
        } else if (isFizz(number)) {
            return "Fizz";
        } else if (isBuzz(number)) {
            return "Buzz";
        } else {
            return "None";
        }
    }

    private static boolean isFizz(int number) {
        return number % 3 == 0;
    }

    private static boolean isBuzz(int number) {
        return number % 5 == 0;
    }

    private static boolean isFizzBuzz(int number) {
        return number % 3 == 0 && number % 5 == 0;
    }
}