package innerclass;

class Outer {
    class Inner{
        public void m1(){
            System.out.println("Inner class m1");
        }
    }
}


public class _4_AccessingInnerClassFromOutSideOfOuterClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.m1();
        new Outer().new Inner().m1();
    }
}
