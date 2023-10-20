package org.study.oop.composition;

public class PersonalComputer extends Product {
    Monitor monitor;
    Motherboard motherboard;
    ComputerCase computerCase;

    public PersonalComputer(String model, String manufacturer, String height, String width, Monitor monitor, Motherboard motherboard, ComputerCase computerCase) {
        super(model, manufacturer, height, width);
        this.monitor = monitor;
        this.motherboard = motherboard;
        this.computerCase = computerCase;
    }

    public void turnOn() {
        computerCase.turnOn();
        motherboard.loadProgram("Windows 10");
        monitor.drawPixelAt(5, 5, "red");
    }

    public void turnOff() {
        computerCase.turnOff();
    }
}
