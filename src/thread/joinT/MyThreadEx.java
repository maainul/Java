package thread.joinT;

class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " - " + Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

public class MyThreadEx {
	public static void main(String[] args) throws InterruptedException {
		MyThread thread = new MyThread();
		thread.start();
		thread.join();

		MyThread thread2 = new MyThread();
		thread2.start();
		thread2.join();

		MyThread thread3 = new MyThread();
		thread3.start();
		thread3.join();

		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "--" + Thread.currentThread().getName());
		}
	}

}
