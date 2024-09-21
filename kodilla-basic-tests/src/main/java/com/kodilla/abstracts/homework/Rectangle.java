package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super(4);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * (width + height);
        return Math.round(perimeter);
    }

    @Override
    public double getArea() {
        double area = width * height;
        return Math.round(area);
    }

}
