package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford(0);
        Opel opel = new Opel(0);
        Mercedes mercedes = new Mercedes(0);
       doRace(opel);
       doRace(mercedes);
       doRace(ford);
    }

    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println("The final speed of the car is: " + car.getSpeed());


    }
}
