package thread.yeilds;

public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        for (int i = 1; i <= 10000000; i++) {
            System.out.println(i + " - " + Thread.currentThread().getName());
        }
    }
}
