package Java8NewFeaturesdurgasoft;

public class ThreadTest {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child thread");
            }
        };
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child thread-1");
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child thread- 2");
            }
        });

        thread1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
        thread2.start();
    }
}
