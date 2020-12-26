package thread.priority;

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

public class MyThreadDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        MyThread mythread = new MyThread();

        System.out.println(mythread.getName());

        mythread.setName("Mainul Thread");

        System.out.println(mythread.getName());

        System.out.println(mythread.getPriority());

        mythread.setPriority(10);

        System.out.println(mythread.getPriority());

        mythread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }

    }
}
