package thread.implementsRunnableInnerClass;

import java.util.concurrent.TimeUnit;

class MyThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
			// sleepOneSecond();
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

public class MyThreadDemo {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		Thread t = new Thread(thread);
		t.setName("Runnable Thread");
		t.start();

		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
			// sleepOneSecond();
		}

	}

	private static void sleepOneSecond() {
		try {
			Thread.sleep(TimeUnit.SECONDS.toMillis(2));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
