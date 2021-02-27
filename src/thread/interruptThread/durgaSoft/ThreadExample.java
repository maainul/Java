package thread.interruptThread.durgaSoft;

class ChildThread extends Thread {
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			System.out.println("I Got Interrupted");
		}
	}
}

public class ThreadExample {

	public static void main(String[] args) {
		ChildThread thread1 = new ChildThread();
		thread1.start();
		thread1.interrupt();
		System.out.println("End of Main");
	}
}

/*
End of Main
Thread-0
I Got Interrupted
*/
