/**
 * @Author Md. Mainul Hasan
 * 
 * 10:53:29 AM
 * 
 * Nov 20, 2020
 *
 */
package thread.learn._3_ThreadJoinAndYield;

class Mythread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class _1_JoinWithoutParameter {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException {
		Mythread tMythread = new Mythread();
		tMythread.start();
		tMythread.join(10000);
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}

	}

}
