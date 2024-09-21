package com.kodilla.abstracts.homework;

public class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        super(0);
        this.radius = radius;
    }

    @Override
    public double getArea(){
        double area = Math.PI * radius * radius;
        return Math.round(area);
    }
    @Override
    public double getPerimeter(){
        double perimeter = 2 * Math.PI * radius;
        return Math.round(perimeter);
    }
}
