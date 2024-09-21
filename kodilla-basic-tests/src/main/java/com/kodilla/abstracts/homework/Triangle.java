package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    private double height;
    private double width;

    public Triangle(double height, double width) {
        super(3);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        double area = (width * height) / 2;
        return Math.round(area);
    }

    @Override
    public double getPerimeter() {
        double perimeter = 3 * width;
        return Math.round(perimeter);
    }


}
