package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Dog dog1 = new Dog();
        Animal dog = new Dog();
        dog.sound();
        Animal cat = new Cat();
        cat.sound();
        Animal[] animals = new Animal[] {new Dog(), new Cat(), new Dog(), new Dog()};
        for (Animal animal : animals){
            animal.sound();
        }
        //dog.sound(3);doesn't work, because Dog is an Animal object and not Dog object.
        ((Dog)dog).sound(3);//it casts the dog object which is Animal type into Dog type
        //this casting is unsafe, use it carefully


    }


}
