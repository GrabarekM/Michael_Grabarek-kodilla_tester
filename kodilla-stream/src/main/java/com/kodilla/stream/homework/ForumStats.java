package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;
import java.util.OptionalDouble;


public class ForumStats {

    public static void main(String[] args) {
       List<User> users = UsersRepository.getUsersList();
        double averagePostsOver40 = getAveragePostsOver40(users);
        double averagePostsUnder40 = getAveragePostUnder40(users);
        System.out.println("Average over 40: " + averagePostsOver40);
        System.out.println("Average under 40: " + averagePostsUnder40);
    }

    public static double getAveragePostsOver40(List<User> users){
        OptionalDouble average = users.stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(User::getNumberOfPost)
                .average();
        return average.orElse(0);

    }
    public static double getAveragePostUnder40(List<User> users) {
        OptionalDouble average = users.stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(User::getNumberOfPost)
                .average();
        return average.orElse(0);
    }

}
