package DesignPatternByNavinReddy.combineFactoryAndBuilderPattern;

public class BottleMain {
    public static void main(String[] args) {
        Bottle bottle1 = new Bottle("Passport Scotch","Green","New Royel");
        System.out.println(bottle1.toString());
        Bottle bottle2 = new BottleBuilder().setBrand("KF").setColor("While").setName("Vodka").getBottle();
        System.out.println(bottle2);
    }

}
