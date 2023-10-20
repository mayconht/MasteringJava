package org.study.oop.composition;

public class Monitor extends Product {
    String resolution;
    String refreshRate;

    public Monitor(String model, String manufacturer, String height, String width, String resolution, String refreshRate) {
        super(model, manufacturer, height, width);
        this.resolution = resolution;
        this.refreshRate = refreshRate;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + "," + y + " in color " + color);
    }


}
