package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 10);
        System.out.println("Area of the Rectangle is: " + rectangle.getArea());
        System.out.println("Perimeter of the Rectangle is: " + rectangle.getPerimeter());

        Shape triangle = new Triangle(4, 4);
        System.out.println("Area of the Triangle is: " + triangle.getArea());
        System.out.println("Perimeter of the Triangle is: " + triangle.getPerimeter());

        Shape circle = new Circle(5);
        System.out.println("Area of the Circle is: " + circle.getArea());
        System.out.println("Perimeter of the Circle is: " + circle.getPerimeter());

        Person person1 = new Person("Michael",28, new Mechanic());
        Person person2 = new Person("Klaudia", 28, new QAEngineer());
        Person person3 = new Person("Krzysio", 56, new Developer());
        System.out.println("JOB PERSON TASK");
        person1.seeRespons();
        person2.seeRespons();
        person3.seeRespons();
    }

}
