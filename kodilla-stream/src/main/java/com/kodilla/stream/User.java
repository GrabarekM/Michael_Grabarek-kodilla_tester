package com.kodilla.stream;

import java.util.Objects;

public class User {
    private String username;
    private int age;
    private int numberOfPost;
    private String group;

    public User(String username, int age, int numberOfPost, String group){
        this.age = age;
        this.username = username;
        this.numberOfPost = numberOfPost;
        this.group = group;
    }

    public int getAge() {
        return age;
    }

    public String getGroup() {
        return group;
    }

    public int getNumberOfPost() {
        return numberOfPost;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && numberOfPost == user.numberOfPost && Objects.equals(username, user.username) && Objects.equals(group, user.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, age, numberOfPost, group);
    }

}
