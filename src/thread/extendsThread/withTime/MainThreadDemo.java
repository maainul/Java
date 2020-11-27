package thread.extendsThread.withTime;

import java.util.concurrent.TimeUnit;

class MyThread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 5; i ++){
            Thread thread = Thread.currentThread();
            System.out.println(thread.getName());
            sleepOneSecond();
        }
    }

    private void sleepOneSecond() {
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(2));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class MainThreadDemo {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.setName("Extended Thread");
        thread.start();
        for (int i = 0; i < 5; i ++){
            System.out.println(Thread.currentThread().getName());
            sleepOneSecond();
        }
    }


    private static void  sleepOneSecond(){
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(2));
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
