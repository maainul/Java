package DesignPatternByNavinReddy._1_factoryDesignPattern;

public class  _Exm_2_Cow implements _Exm_2_Animal{

    @Override
    public void eat() {
        System.out.println("The cow eats grass and fruit");
    }

    @Override
    public void sleep() {
        System.out.println("The cow sleep at night");
    }
}
