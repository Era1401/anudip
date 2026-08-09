package org.example;

import entity.*;
public class Main {
    static void main() {
        //Singleton Pattern
//        Principal obj1 = Principal.getInstance();
//        Principal obj2 = Principal.getInstance();
//        System.out.println(obj1);
//        System.out.println(obj2);

//        //Factory Pattern
//        Car obj = CarFactory.getCar("bmw");
//        obj.start();

//        Animal animal = AnimalFactory.getSound("cat");
//        animal.sound();

        Engine engine = new Diesel();
        Car1 car = new Car1(engine);
        engine.start();

    }
}
