package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;

    public OperatingSystem(int year) {
        this.year = year;
    }

    public void turnOff() {
        System.out.println("System is turning off");
    }
    public void turnOn() {
        System.out.println("System is turning on");
    }
    public int getYearOperating() {
        return year;
    }

}
