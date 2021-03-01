package compiletimeAndRuntime;

abstract class Calculator{

    int a, b;
    public abstract int add(int a, int b);

    public int sub(int a, int b){
        return a-b;
    }

    Calculator(){

    }
    Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

public static void show(){
    System.out.println("Abstract method");
}


}


public class AbstractTest extends Calculator{
    @Override
    public int add(int a, int b) {
        return  a + b;
    }

    public static void main(String[] args) {
      Calculator abstractTest = new AbstractTest();
        System.out.println(abstractTest.add(1,2));
        System.out.println(abstractTest.sub(2,1));
        show();

    }


}
