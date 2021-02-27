package thread.interruptThread.usingFlag;

public class MyThread extends Thread {
	public boolean running = true;

	@Override
	public void run() {
		while (running) {
			System.out.println("Hello Thread is running");
		}
		System.out.println("Thread is stopped ");
	}

	public void shutdown() {
		this.running = false;
	}

	public static void main(String[] args) throws InterruptedException {
		MyThread thread = new MyThread();
		thread.start();

		Thread.sleep(1000);

		thread.shutdown();

	}

}
