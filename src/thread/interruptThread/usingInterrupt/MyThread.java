package thread.interruptThread.usingInterrupt;

class MyThread extends Thread {

	@Override
	public void run() {
		while (!Thread.interrupted()) {
			System.out.println("hello");
		}
		System.out.println("hello stop");

	}

	public static void main(String[] args) throws InterruptedException {
		MyThread thread = new MyThread();

		System.out.println(thread.getName());
		thread.start();

		System.out.println(Thread.currentThread().getName());
		Thread.sleep(10);

		thread.interrupt();

	}
}
