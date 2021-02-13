package DesignPatternByNavinReddy._1_factoryDesignPattern;

public class _Exm_2_Horse implements _Exm_2_Animal{

    @Override
    public void eat() {
        System.out.println("Horse Eat fresh grass");
    }

    @Override
    public void sleep() {
        System.out.println("The horse sleep in Night");
    }
}
