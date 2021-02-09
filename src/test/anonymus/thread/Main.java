package test.anonymus.thread;

public class Main {
	public static void main(String[] args) {
		Mythread mythread = new Mythread();
		mythread.start();

		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}

}
