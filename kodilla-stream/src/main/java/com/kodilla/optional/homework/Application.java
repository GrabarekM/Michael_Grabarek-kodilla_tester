package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("John");
        Teacher teacher2 = new Teacher("Steven");

        List<Student> students = new ArrayList<>();
        students.add(new Student("Michael", teacher1));
        students.add(new Student("Ben", teacher2));
        students.add(new Student("Ben 10", null));
        students.add(new Student("Deedee", teacher2));
        for (Student student : students) {
            String name = Optional.ofNullable(student.getTeacher())
                    .map(Teacher::getName)
                    .orElse("<undefined>");
            System.out.println("Student: " + student.getName() + " Teacher: " + name);
        }
    }
}
