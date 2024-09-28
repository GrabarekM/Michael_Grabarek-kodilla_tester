package com.kodilla.collections.arrays.homework;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Mercedes;

public class CarsUtils {
    public static void describeCar(Car car){
        System.out.println("-----------------------------");
        System.out.println("Car brand: " + getCarName(car));
        System.out.println("Car speed increase: " + car.getSpeed());
    }
    private static String getCarName(Car car){
        if (car instanceof Mercedes)
            return "Mercedes";
        else if (car instanceof Opel)
            return "Opel";
        else if (car instanceof Ford)
            return "Ford";
        else
            return "Unknown car brand";
    }
}
