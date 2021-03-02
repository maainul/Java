package innerclass;

// We can access Static or non static member from outer class
// can access static and non-static variable in the inner class
// can access static and non-static method in the inner class

public class _5_NormalInnerClass {
    int a = 10;
    static int b = 20;


    public void m2Outer() {
        System.out.println("M2 Outer");
    }


    public static void m3Outer(){
        System.out.println(b);
        System.out.println("m3 Outer");
    }

    class Inner {
        public void m1() {
            System.out.println("Instance method call = " + a);
            System.out.println("static method call = " + b);
        }


        public void m2() {
            m3Outer();
            m2Outer();
        }

    }

    public static void main(String[] args) {

        new _5_NormalInnerClass().new Inner().m1();

        new _5_NormalInnerClass().new Inner().m2();

    }
}
