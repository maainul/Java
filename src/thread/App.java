package thread;

public class App  extends Thread{
    boolean flag = true;
    int i = 0;
    public void run(){

        while (flag){
            System.out.println("thread running");
            if (flag == false){
                break;
            }
            i++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        App obj = new App();
        obj.start();
        Thread.sleep(500);
        obj.flag = false;
        System.out.println(obj.i);

    }
}
