package com.kodilla.abstracts.homework;

public abstract class Shape {
    private int sides;

    public Shape(int sides) {
        this.sides = sides;
    }

    public int getSides() {
        return sides;
    }



    public abstract double getArea();
    public abstract double getPerimeter();
}
