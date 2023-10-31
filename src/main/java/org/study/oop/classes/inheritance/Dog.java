package org.study.oop.classes.inheritance;

public class Dog extends Animal {
    public Dog(String type, String size, String weight) {
        super(type, size, weight);
    }
 
    @Override
    public void move(String speed) {
        super.move(speed);
        System.out.println("Dog is moving and wagging its tail");
    }

    public void bark() {
        System.out.println("Dog is barking");
    }


    //this is an example of inheritance
    // is used to reuse code

}

