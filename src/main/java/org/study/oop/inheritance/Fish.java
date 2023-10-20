package org.study.oop.inheritance;

public class Fish extends Animal {
    public Fish(String type, String size, String weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        System.out.println("Fish is swimming");
    }

    public void eat() {
        System.out.println("Fish is eating");
    }


}
