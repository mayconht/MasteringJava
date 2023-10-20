package org.study.oop.composition;

public class Motherboard extends Product {
    String socket;
    String chipset;

    public Motherboard(String model, String manufacturer, String height, String width, String socket, String chipset) {
        super(model, manufacturer, height, width);
        this.socket = socket;
        this.chipset = chipset;
    }

    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is loading");
    }

    //Composition is a way to reuse code, making a combination of classes, instead of inheriting from them
    //it acts like a "has a" relationship

}
