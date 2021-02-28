package _7_Concurrency;

public class _2_CreatingThreadImplemntsRunnable implements Runnable {
    public static void main(String[] args) {
        new Thread(new _2_CreatingThreadImplemntsRunnable()).start();
        System.out.println(Thread.currentThread().getName());
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
