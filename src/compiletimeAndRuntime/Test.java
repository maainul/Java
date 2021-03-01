package compiletimeAndRuntime;

class Base{
    public void eat(){
        System.out.println("Bease class");
    }
}

public class Test extends Base{

    public void walk(){
        System.out.println("walk in child");
    }

    public static void main(String[] args) {
        Base base = new Test();
        base.eat();


        Test test = new Test();
        test.walk();

        System.out.println(base instanceof Base);
    }



}
