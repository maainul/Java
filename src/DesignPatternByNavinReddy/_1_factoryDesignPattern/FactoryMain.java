package DesignPatternByNavinReddy._1_factoryDesignPattern;

public class FactoryMain {
    public static void main(String[] args) {
        // with using FactoryPattern
        OperatingSystemFactory operatingSystemFactory = new OperatingSystemFactory();

        OS os1 = operatingSystemFactory.getInstance("Open");
        os1.spec();

        // Without using FactoryPattern
        OS os2 = new WIndows();
        os2.spec();


    }
}
// Not expose what class we are working
// factory pattern says create a class name with factory and call that class in the Factory main class.

