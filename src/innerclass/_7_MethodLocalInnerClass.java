package innerclass;

public class _7_MethodLocalInnerClass {

    int a = 10;
    static int b = 200;
    // declare inside non-static method
    public void m1(){
        final int x = 80;
        class Inner{
            public void add(){
                System.out.println("Method local m1 call from inner class variable = "+a);
                System.out.println("Method local m1 call from inner class variable = "+b);
                System.out.println(x);
                System.out.println("Test Inner for method local inner class");
            }
        }

        Inner inner = new Inner();
        inner.add();

    }

    public static void m2(){
        class Inner{
            public  void sub(){
                System.out.println("Static method call static variable = "+b);
                System.out.println("Static method inner class sub method");
            }
        }

        Inner inner = new Inner();
        inner.sub();
    }


    public static void main(String[] args) {
        _7_MethodLocalInnerClass outer = new _7_MethodLocalInnerClass();

        outer.m1();
        outer.m2();
    }
}
