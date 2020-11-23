package thread.learn._1_WayOfDefningThread.ByUsingThreadClass;

public class Mythread extends Thread{

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child thread");
		}
	}

}
