package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ApplicationTest {

    @Test
    public void testStudentWithTeacher() {
        //given
        Teacher teacher = new Teacher("John");
        Student student = new Student("Michael", teacher);
        //when
        String teacherName = Optional.ofNullable(student.getTeacher())
                .map(Teacher::getName)
                .orElse("<undefined>");
        //then
        assertEquals("John", teacherName);
    }

    @Test
    public void testStudentWithNoTeacher() {
        //Given
        Student student = new Student("Ben 10", null);
        // when
        String teacherName = Optional.ofNullable(student.getTeacher())
                .map(Teacher::getName)
                .orElse("<undefined>");
        // then
        assertEquals("<undefined>", teacherName);
    }

    @Test
    public void testStudentList() {
        //given
        Teacher teacher1 = new Teacher("John");
        Teacher teacher2 = new Teacher("Steven");
        List<Student> students = new ArrayList<>();
        students.add(new Student("Michael", teacher1));
        students.add(new Student("Ben", teacher2));
        students.add(new Student("Ben 10", null));
        students.add(new Student("Deedee", teacher2));
        //when
        List<String> result = new ArrayList<>();
        for (Student student : students) {
            String teacherName = Optional.ofNullable(student.getTeacher())
                    .map(Teacher::getName)
                    .orElse("<undefined>");
            result.add("Student: " + student.getName() + " Teacher: " + teacherName);
        }
        //then
        assertEquals("Student: Michael Teacher: John", result.get(0));
        assertEquals("Student: Ben Teacher: Steven", result.get(1));
        assertEquals("Student: Ben 10 Teacher: <undefined>", result.get(2));
        assertEquals("Student: Deedee Teacher: Steven", result.get(3));
    }
}