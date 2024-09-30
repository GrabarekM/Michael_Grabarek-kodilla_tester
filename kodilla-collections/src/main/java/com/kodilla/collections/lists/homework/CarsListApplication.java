package com.kodilla.collections.lists.homework;
import com.kodilla.collections.arrays.homework.CarsUtils;
import com.kodilla.collections.interfaces.homework.Opel;
import java.util.List;
import java.util.ArrayList;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Opel> cars = new ArrayList<>();
        cars.add(new Opel(109));
        cars.add(new Opel(150));
        cars.add(new Opel(330));
        cars.add(new Opel(230));
        for (Opel opel : cars) {
            CarsUtils.describeCar(opel);
        }

        System.out.println("-------------------------");
        System.out.println(cars.size());
        System.out.println("-------------------------");

        for (Opel opel : cars) {
            CarsUtils.describeCar(opel);
        }
        Opel opelRemove = new Opel(150);
        cars.remove(opelRemove);
        cars.remove(1);

        for (Opel opel : cars) {
            CarsUtils.describeCar(opel);
        }
        System.out.println("-------------------------");
        System.out.println(cars.size());
        System.out.println("-------------------------");
    }
}
