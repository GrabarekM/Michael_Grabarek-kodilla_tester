package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamps> stamps = new HashSet<>();
        stamps.add(new Stamps("President", 5.0, 6.0));
        stamps.add(new Stamps("City", 3.0, 6.0));
        stamps.add(new Stamps("President", 5.0, 6.0));
        stamps.add(new Stamps("View", 1.0, 2.0));
        System.out.println(stamps.size());
        for (Stamps stamp : stamps) {
            System.out.println(stamp);
        }
    }
}
