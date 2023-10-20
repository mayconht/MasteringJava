package org.study.oop.composition;

public class ComputerCase extends Product {
    String powerSupply;
    String color;

    public ComputerCase(String model, String manufacturer, String height, String width, String powerSuply, String color) {
        super(model, manufacturer, height, width);
        this.powerSupply = powerSuply;
        this.color = color;
    }

    public void turnOn() {
        System.out.println("Computer is turning on");
    }

    public void turnOff() {
        System.out.println("Computer is turning off");
    }


}
