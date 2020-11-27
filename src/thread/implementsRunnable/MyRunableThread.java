package thread.implementsRunnable;

import java.util.concurrent.TimeUnit;

class TestRunable implements Runnable{


    @Override
    public void run() {
        for (int i = 0; i <5; i++){
            System.out.println(Thread.currentThread().getName());
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
public class MyRunableThread{
    public static void main(String[] args) {
        TestRunable testRunable = new TestRunable();
        Thread thread = new Thread(testRunable);
        thread.setName("Runnable Thread");
        thread.start();


        for (int i = 0; i < 5; i++){
            System.out.println(i +" "+Thread.currentThread().getName());
            sleepOneSecond();
        }
    }

    private static void sleepOneSecond(){
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(2));
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}