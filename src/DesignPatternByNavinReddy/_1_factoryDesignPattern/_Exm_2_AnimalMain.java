package DesignPatternByNavinReddy._1_factoryDesignPattern;

public class _Exm_2_AnimalMain {
    public static void main(String[] args) {

        _Exm_2_Animal horse = new _Exm_2_Horse();
        horse.eat();
        horse.sleep();
        _Exm_2_Animal cow = new _Exm_2_AnimalFactory().getInstance("Cow");
        cow.sleep();
        cow.eat();

    }
}
