//package com.kodilla.stream.homework;
//
//import com.kodilla.stream.User;
//import org.junit.jupiter.api.Test;
//
//import java.util.Arrays;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class ForumStatsTestSuite {
//    @Test
//    void testGetAverageOver40() {
//        List<User> users = Arrays.asList(
//                new User("Michael", 40, 100, "Student"),
//                new User("Jack", 45, 50, "Something"),
//                new User("Paul", 60, 5,"Chemist"),
//                new User("Claudia", 20, 500, "Teacher")
//                );
//        double result = ForumStats.getAveragePostsOver40(users);
//        assertEquals(27.5, result, 0.01);
//    }
//    @Test
//    void testGetAverageUnder40() {
//        List<User> users = Arrays.asList(
//                new User("Michael", 39, 100, "Student"),
//                new User("Jack", 45, 50, "Something"),
//                new User("Paul", 60, 5, "Chemist"),
//                new User("Claudia", 20, 500, "Teacher")
//        );
//        double result = ForumStats.getAveragePostUnder40(users);
//        assertEquals(27.5, result, 0.01);
//    }
//    @Test
//    void testGetAverageUnder40WithNoUsers() {
//            List<User> users = Arrays.asList(
//                    new User("Michael", 41, 100, "Student"),
//                    new User("Jack", 40, 50, "Something")
//                    );
//            double result = ForumStats.getAveragePostUnder40(users);
//            assertEquals(0, result, 0.01);
//        }
//    @Test
//    void testGetAverageOver40WithNoUsers() {
//        List<User> users = Arrays.asList(
//                new User("Michael", 39, 100, "Student"),
//                new User("Jack", 30, 50, "Something")
//        );
//        double result = ForumStats.getAveragePostsOver40(users);
//        assertEquals(0, result, 0.01);
//    }
//}
