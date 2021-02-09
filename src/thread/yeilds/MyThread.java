package thread.yeilds;

public class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 100000000; i++) {
			System.out.println(i + " - " + Thread.currentThread().getName());
			Thread.yield();
		}
	}
}
