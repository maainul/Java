package thread.joinT;

class TThread extends Thread {
	@Override
	public void run() {
		while (!Thread.interrupted()) {
			for (int i = 0; i < 100; i++) {
				System.out.println(i + "--" + Thread.currentThread().getName());

			}
		}
		System.out.println("End");

	}

}

public class MyInterruptDemo {
	public static void main(String[] args) throws InterruptedException {
		TThread thread = new TThread();
		thread.start();
		Thread.sleep(1000);
		thread.interrupt();

	}
}
