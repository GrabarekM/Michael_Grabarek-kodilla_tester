package com.kodilla.collections.arrays.homework;

import java.util.Random;

import com.kodilla.collections.arrays.ShapeUtils;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Mercedes;

public class CarsApplication {

    public static void main(String[] args) {
        Random random = new Random();
        int arraySize = random.nextInt(15+1 - 1) + 1;
        Car[] cars = new Car[arraySize];
        for (int i = 0; i < cars.length; i++)
            cars[i] = drawCar();
        for ( Car car : cars)
            CarsUtils.describeCar(car);
    }

    public static Car drawCar() {
        Random random = new Random();
        int randomSpeedCar = random.nextInt(3);
        int a = getRandomSpeedIncrease(random);
        if (randomSpeedCar == 0)
            return new Opel(a);
        else if (randomSpeedCar == 1)
            return new Mercedes(a);
        else
            return new Ford(a);
    }

    private static int getRandomSpeedIncrease(Random random) {
        return random.nextInt(40+1 - 30) + 30;
    }

}
