package DesignPatternByNavinReddy._1_factoryDesignPattern;

public class _Exm_2_Lion implements _Exm_2_Animal{

    @Override
    public void eat() {
        System.out.println("The lion eat meat");
    }

    @Override
    public void sleep() {
        System.out.println("The lion sleep all day long");
    }
}
