package com.kodilla.spring.basic.spring_configuration.homework;

public class SUV implements Car {

    @Override
    public boolean hasHeadlightsTurnedOn(int hour) {
        return hour >= 20 || hour < 6;
    }

    @Override
    public String getCarType() {
        return "SUV";
    }
}