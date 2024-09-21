package com.kodilla.abstracts;

public class Application {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.giveVoice();
        System.out.println("Number of legs for dog: " + dog.getNumberOfLegs());

        Duck duck = new Duck();
        duck.giveVoice();
        System.out.println("Number of legs for duck: " + duck.getNumberOfLegs());

//  Przykład - poliformizn
        Animal ddog = new Dog();
        AnimalProcessor processor = new AnimalProcessor();
        processor.process(ddog);
    }
}
