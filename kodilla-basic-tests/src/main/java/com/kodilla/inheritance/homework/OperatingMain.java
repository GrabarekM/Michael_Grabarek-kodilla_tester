package com.kodilla.inheritance.homework;

public class OperatingMain {
    public static void main(String[] args){
        OperatingSystem windows = new Windows(1990);
        OperatingSystem macOS = new MacOS(2000);

        windows.turnOff();
        windows.turnOn();
        System.out.println("Year of Windows OS is: " + windows.getYearOperating());

        macOS.turnOn();
        macOS.turnOff();
        System.out.println("Year of MacOS is: " + macOS.getYearOperating());

    }
}
