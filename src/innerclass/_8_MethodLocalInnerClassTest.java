package innerclass;

// Method local inner class -
// If method is non-static then we can call instance variable and static variable also.
// If method is static then we can't call non static variable..
public class _8_MethodLocalInnerClassTest {
    int i = 10;
    static int j = 50;

    public void m1() {
        int k = 100;
        final int m = 200;

        class Inner {
            public void m2() {
                System.out.println("Instance Member variable from Outside of inner class = " + i);
                System.out.println("Static Member variable from Outside of Inner class = " + j);
                System.out.println("Instance Local Variable from m1 method = "+k);
                System.out.println("Final Local Variable form m1 method = " +m);
            }
        }
        Inner inner = new Inner();
        inner.m2();
    }


    public static void m3() {
        int k = 100;
        final int m = 200;

        class Inner {
            public void m2() {

               // System.out.println("Instance Member variable from Outside of inner class = " + i);
                System.out.println("Static Member variable from Outside of Inner class = " + j);
                System.out.println("Instance Local Variable from m1 method = "+k);
                System.out.println("Final Local Variable form m1 method = " +m);
            }
        }
        Inner inner = new Inner();
        inner.m2();
    }

    public static void main(String[] args) {
        _8_MethodLocalInnerClassTest outer = new _8_MethodLocalInnerClassTest();
        outer.m1();
    }
}
