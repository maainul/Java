package innerclass;

public class _14_StaticNestedCLass {
    static class Inner{
        public void m1(){
            System.out.println("Static class m1 method");
        }
    }

    public static void main(String[] args) {
        Inner inner = new Inner();
        inner.m1();
    }
}
