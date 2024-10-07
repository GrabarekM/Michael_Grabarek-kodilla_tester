package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> classes = new ArrayList<>();
    private String schoolName;

    public School(String schoolName, List<Integer> classes){
        this.classes = classes;
        this.schoolName = schoolName;

    }
    public int getSum() {
        int total = 0;
        for (int studentsInClass : classes) {
            total += studentsInClass;
        }
        return total;
    }

    public List<Integer> getClasses() {
        return classes;
    }

    public String getSchoolName() {
        return schoolName;
    }

    @Override
    public String toString() {
        return "School{" +
                "classes=" + classes +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
