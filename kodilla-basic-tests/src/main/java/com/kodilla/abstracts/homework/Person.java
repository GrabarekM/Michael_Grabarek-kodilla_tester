package com.kodilla.abstracts.homework;

class Person {
    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public void seeRespons() {
        System.out.println(firstName+ " age of " + age + " is a " + job.getWork() + " and his responsibility is to " + job.getRespons());
        System.out.println("He makes around: " + job.getSalary());
    }
}
