/**
 * @Author Md. Mainul Hasan
 * 
 * 10:40:58 AM
 * 
 * Nov 21, 2020
 *
 */
package thread._4_SleepMethod;

class MythreadD extends Thread {
	public void run() {

		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("I am lazy");
				Thread.sleep(2000);
			}

		} catch (InterruptedException e) {
			System.out.println("I got interrupted");
		}

	}
}

public class _2_SleepWithInterruption {

	public static void main(String[] args) {
		MythreadD tMythread = new MythreadD();
		tMythread.start();
		tMythread.interrupt();
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Method");
		}

	}
}
