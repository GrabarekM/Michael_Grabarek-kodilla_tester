package com.kodilla.stream.exception;


import java.util.Scanner;

public class UserDialogs {
    public static int getNumberOfRound(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number of round:");
            String s = scanner.nextLine();
            try {
                int rounds = Integer.parseInt(s);
                return rounds;
            } catch (Exception e) {
                System.out.println("Wrong data, Enter digits only");
            }
        }
    }
}
