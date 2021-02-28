package _7_Concurrency;

public class _1_CreatingThreaUsingThread  extends Thread{

    public void run(){
        for(int i = 0; i < 3; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        new _1_CreatingThreaUsingThread().start();
        System.out.println(Thread.currentThread().getName());


    }

}
