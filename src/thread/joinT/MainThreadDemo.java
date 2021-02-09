package thread.joinT;

class MyTThread extends Thread {
	static Thread mt;

	@Override
	public void run() {
		try {
			mt.join();
			// Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " - " + Thread.currentThread().getName());
		}

	}
}

public class MainThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		MyTThread mt = (MyTThread) Thread.currentThread();
		System.out.println(mt.getName());
		MyTThread thread = new MyTThread();
		thread.start();

		MyTThread thread2 = new MyTThread();
		thread2.start();
		thread2.join();

		MyTThread thread3 = new MyTThread();
		thread3.start();
		thread3.join();

		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "--" + Thread.currentThread().getName());
			Thread.sleep(2000);
		}
	}
}
