package innerclass;

public class _15_NestedStaticClassCanHaveMainMethod {

    static class Inner {
        public static void main(String[] args) {
            System.out.println("Inner class Main method");
        }
    }

    public static void main(String[] args) {
        System.out.println("Outer class");
    }

}
