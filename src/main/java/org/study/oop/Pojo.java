package org.study.oop;

public class Pojo {
    private int x;
    private int y;

    //Pojo is also known as a bean or a model (DTO) - Pojo stands for Plain Old Java Object
    public Pojo(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("pojo class called in constructor with parameters");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
