package test.nestedClass;

public class Outer {
    static class NestedClass {
        public void m1() {
            System.out.println("Nested class ");
        }
    }

    public static void main(String[] args) {
        NestedClass nestedClass = new NestedClass();
        nestedClass.m1();
    }


}
