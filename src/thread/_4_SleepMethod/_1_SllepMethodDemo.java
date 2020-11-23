/**
 * @Author Md. Mainul Hasan
 * 
 * 10:38:00 AM
 * 
 * Nov 21, 2020
 *
 */
package thread._4_SleepMethod;

class Mythread extends Thread{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("I am lazy");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("I got interrupted");
			}
		}
	}
}




public class _1_SllepMethodDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Mythread tMythread = new Mythread();
		tMythread.start();
		

	}

}
