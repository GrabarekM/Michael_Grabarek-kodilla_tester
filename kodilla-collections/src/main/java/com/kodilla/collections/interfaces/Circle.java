package com.kodilla.collections.interfaces;

import java.util.Objects;

public class Circle implements Shape {
   private double width;

   public Circle(double width){
       this.width = width;
   }
    @Override
    public double getArea() {
        return 2 * Math.PI * width;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * width *width;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "width=" + width +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(width, circle.width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(width);
    }
}
