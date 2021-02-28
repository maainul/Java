package superKeyWord;

class AAnimal{
    void eat(){
        System.out.println("Animal Eating");
    }
}
class DDog extends AAnimal{
    void eat(){
        System.out.println("Dog eating");
        super.eat();
    }

    void bark(){
        System.out.println("Barking");
    }

}



public class _2_InvokeParentClassMethod {
    public static void main(String[] args) {
        DDog dog = new DDog();
        dog.eat();
    }
}
