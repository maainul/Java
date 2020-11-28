package thread.stopAthread;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Watch implements Runnable{
    private boolean running = true;
    @Override
    public void run() {
        while(running){
            printCurrentDateTime();
            //sleepOneSecond();

            if (Thread.interrupted()){
                System.out.println("Thread is interrupted.");
                return;
            }
        }

    }

    private void sleepOneSecond() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void shutdown(){
        this.running = false;
    }

    private void printCurrentDateTime() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:s a");

        String formattedCurrentTime = LocalDateTime.now().format(formatter);

        System.out.println(formattedCurrentTime);

    }

    public static void main(String[] args) throws InterruptedException{
        Watch watch = new Watch();
        Thread thread = new Thread(watch);
        thread.start();

        Thread.sleep(5000);
        watch.shutdown();


    }


}
