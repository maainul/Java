package DesignPatternByNavinReddy.combineFactoryAndBuilderPattern;

public class Bottle {
    String name;
    String color;
    String brand;

    public Bottle(String name, String color, String brand) {
        this.name = name;
        this.color = color;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Bottle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
