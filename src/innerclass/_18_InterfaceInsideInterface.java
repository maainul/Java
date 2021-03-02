package innerclass;

interface OuterInterface {
    public void m1();

    interface InnerInterface {
        public void m2();
    }
}


class Test1 implements OuterInterface {

    @Override
    public void m1() {
        System.out.println("M1 method of Outer is implemented");
    }
}


class Test2 implements OuterInterface.InnerInterface {

    @Override
    public void m2() {
        System.out.println("Inner Interface method implemented");
    }
}

public class _18_InterfaceInsideInterface {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.m1();

        Test2 test2 = new Test2();
        test2.m2();
    }
}
