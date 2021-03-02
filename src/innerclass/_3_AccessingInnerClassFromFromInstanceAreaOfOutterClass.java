package innerclass;

public class _3_AccessingInnerClassFromFromInstanceAreaOfOutterClass {
    class Inner {
        public void m1() {
            System.out.println("M1 inner class...");
        }
    }

    public void m2() {
        Inner inner = new Inner();
        inner.m1();
    }

    public static void main(String[] args) {
        _3_AccessingInnerClassFromFromInstanceAreaOfOutterClass outer = new _3_AccessingInnerClassFromFromInstanceAreaOfOutterClass();
        outer.m2();
    }
}
