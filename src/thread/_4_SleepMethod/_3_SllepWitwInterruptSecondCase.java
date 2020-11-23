package thread._4_SleepMethod;

class MythreaddD extends Thread {
	
	public void run() {

		for (int i = 1; i <= 100000; i++) {
			System.out.println("I am lazy" + i);
		}
		System.out.println("I want to sleep");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("I got interrupted");
		}

	}
}

public class _3_SllepWitwInterruptSecondCase {

	public static void main(String[] args) {
		MythreaddD tMythread = new MythreaddD();
		tMythread.start();
		tMythread.interrupt();

		System.out.println("Main Thread");

	}
}
