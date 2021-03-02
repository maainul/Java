package innerclass;

// // inside inner class we can declare another inner class
class OuterClass {
    static int b = 20;
    int a = 200;


    class B {
        public void m1B() {
            System.out.println("Call from Inner class A = " + a);
        }

        class C {
            public void m1() {
                System.out.println("Call from C = "+a);
                System.out.println("Call from b = "+b);
                System.out.println("C inner Class");
            }
        }
    }
}

public class _6_NestingOfInnerClass {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        System.out.println("Outer class a = " + outer.a);
        OuterClass.B b = outer.new B();
        b.m1B();
        OuterClass.B.C c = new OuterClass().new B().new C();
        c.m1();

    }

}


