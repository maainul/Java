package superKeyWord;

class Animal{
    String color = "white";
}

class Dog extends Animal{
    String color = "Black";

    void printColor(){
        System.out.println(color); // color of dog
        System.out.println(super.color); // print color of animal
    }
}


public class _1_To_refer_Parent_Class_Instance_Variable {
    public static void main(String[] args) {
        Dog dog= new Dog();
        dog.printColor();
    }

}
