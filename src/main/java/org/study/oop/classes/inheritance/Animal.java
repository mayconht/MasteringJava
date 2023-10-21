package org.study.oop.classes.inheritance;

public class Animal {

    String type;
    String size;
    String weight;

    public Animal(String type, String size, String weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public void move(String speed) {
        System.out.println("Animal " + type + " is moving with speed: " + speed);
    }

    public void makeNoise() {
        System.out.println("Animal " + type + " is making noise");
    }
}
