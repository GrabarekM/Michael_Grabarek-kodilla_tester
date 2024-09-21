package com.kodilla.inheritance.homework;

public class MacOS extends OperatingSystem {

    public MacOS(int year) {
        super(year);
    }

    @Override
    public void turnOn() {
        System.out.println("MacOS is turning On");
    }
    @Override
    public void turnOff() {
        System.out.println("MacOs is tuning Off");
    }

}
