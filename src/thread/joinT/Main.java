package thread.joinT;

class MyyThread extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
			// System.out.println("Child thread : " + i);

		}

	}
}

public class Main {

	public static void main(String[] args) throws InterruptedException {
		MyyThread thread = new MyyThread();
		thread.start();

		thread.join(1000);

		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread  : " + i);
		}

		MyyThread thread2 = new MyyThread();
		thread2.start();

		MyyThread thread3 = new MyyThread();
		thread3.start();

	}

}
