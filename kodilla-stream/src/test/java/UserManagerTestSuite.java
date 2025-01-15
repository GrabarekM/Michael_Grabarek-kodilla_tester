//package com.kodilla.stream;
//
//import org.junit.jupiter.api.Test;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//
//public class UserManagerTestSuite {
//    @Test
//    public void testFilterChemistGroupUsernames() {
//        // given
//        List<String> names = List.of("Walter White", "Gale Boetticher");
//        // when
//        List<String> result = UsersManager.filterChemistGroupUsernames();
//        // then
//        assertEquals(names, result);
//    }
//    @Test
//    public void testFilterUsersAge() {
//        // given
//        int age = 40;
//        int number = 4;
//        // when
//        List<User> result = UsersManager.filterUsersAge(age);
//        // then
//        assertEquals(number, result.size());
//    }
//@Test
//public void testFilterUsersPosts() {
//    // given
//    int expectedNumberOfUsers = 2;
//    // when
//    List<User> result = UsersManager.filterUsersWithMoreThan100Posts();
//    // then
//    assertEquals(expectedNumberOfUsers, result.size());
//    }
//}