package DesignPatternByNavinReddy.combineFactoryAndBuilderPattern;

public class BottleBuilder {
    String name;
    String color;
    String brand;

    public BottleBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public BottleBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public BottleBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }
    public Bottle getBottle() {
        return new Bottle(name,color,brand);
    }
}
