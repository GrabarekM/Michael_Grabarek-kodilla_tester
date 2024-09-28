package com.kodilla.collections.interfaces;

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
}
