package test.anonymus.thread.innerClassImp;

public class MyDemoThread {

    public static void main(String[] args) {

        Thread thread = new Thread() {

            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName());
                }
            }

        };

        Thread thread2 = new Thread() {

            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName());
                }
            }

        };


        Thread thread3 = new Thread() {

            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName());
                }
            }

        };

        thread.start();
        thread2.start();
        thread3.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }

    }


}
