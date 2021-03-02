package innerclass;
// https://www.geeksforgeeks.org/anonymous-inner-class-java/
public class _12_AnonymousInnerClassThatImplementsRunnable {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Child class...");

            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("Main Thread");
    }
}
