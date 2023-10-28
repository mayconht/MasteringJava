package org.study.oop.abstraction;

interface Animal {
    void makeSound();
//    you cannot have a method with a body in an interface
//    but you can have a method with a body in an abstract class

    void move();
}

public class Cat implements Animal {

    public Cat() {
    }

    @Override
    public void makeSound() {
        System.out.println("Cat is meowing");
    }

    @Override
    public void move() {
        System.out.println("Cat is moving and wagging its tail");
    }
}