package innerclass;
// https://www.geeksforgeeks.org/anonymous-inner-class-java/
public class _11_AnonymousInnerClassThatExtendsAnotherClass {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            public void run() {
                System.out.println("Child threa");
            }
        };
        thread.start();
        System.out.println("Main Thread");
    }
}
