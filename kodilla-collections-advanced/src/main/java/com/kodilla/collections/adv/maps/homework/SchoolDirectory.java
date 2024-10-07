package com.kodilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> sorting = new HashMap<>();
        Principal paul = new Principal("Johnson", "Paul");
        Principal john = new Principal("Smith", "John");
        Principal gregory = new Principal("House", "Gregory");
        School firstOne = new School("Elementary school nr 1", Arrays.asList(15, 30, 25, 23, 14));
        School secondOne = new School("Highschool nr 3", Arrays.asList(14,25,23,11,24));
        School thirdOne = new School("Medical school", Arrays.asList(36, 24, 25, 13, 24));

        sorting.put(paul, firstOne);
        sorting.put(john, secondOne);
        sorting.put(gregory, thirdOne);

        for (Map.Entry<Principal, School> entry : sorting.entrySet()) {
            Principal principal = entry.getKey();
            School school = entry.getValue();

            System.out.println("Dyrektor: " + principal.getPrincFirstName() + " " + principal.getPrincLastname());
            System.out.println("Nazwa szkoły: " + school.getSchoolName());
            System.out.println("Liczba uczniów w szkole: " + school.getSum());
            System.out.println();

        }
    }
}
