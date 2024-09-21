package com.kodilla.abstracts.homework;

public abstract class Job {
    private int salary;
    private String respons;
    private String work;

public Job(int salary, String respons, String work) {
    this.salary = salary;
    this.respons = respons;
    this.work = work;
}

public int getSalary() {
    return salary;
}
public String getRespons() {
    return respons;
}
public String getWork() {
    return work;
}
}