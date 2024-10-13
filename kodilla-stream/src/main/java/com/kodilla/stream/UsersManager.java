package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;
import static java.util.Arrays.stream;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistUsernames = filterChemistGroupUsernames();
        chemistUsernames.forEach(System.out::println);
    }

    public static List<String> filterChemistGroupUsernames() {
        return UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
    }
    public static List<User> filterUsersAge(int age) {
        return UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > age)
                .collect(Collectors.toList());
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }
    public static List<User> filterUsersWithMoreThan100Posts() {
        return UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getNumberOfPost() > 115)
                .collect(Collectors.toList());
    }
}