package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamps {
    private String name;
    private double height;
    private double width;

    public Stamps(String name, double height, double width){
       this.name = name;
       this.height = height;
       this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamps stamps = (Stamps) o;
        return Double.compare(height, stamps.height) == 0 && Double.compare(width, stamps.width) == 0 && Objects.equals(name, stamps.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height, width);
    }

    @Override
    public String toString() {
        return "Stamps{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
