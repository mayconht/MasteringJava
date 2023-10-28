package org.study.oop.abstraction;

abstract class Animal2 {
    abstract void makeSound();

    public void move() {
        System.out.println("Animal is moving");
//        you can have a method with a body in an abstract class
//        but you cannot have a method with a body in an interface
    }
}

public class Snake extends Animal2 {

    public Snake() {
    }

    @Override
    public void makeSound() {
        System.out.println("Snake is hissing");
    }
}

