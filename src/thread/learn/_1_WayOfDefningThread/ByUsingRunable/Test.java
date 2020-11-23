/**
 * @Author Md. Mainul Hasan
 * 
 * 9:07:53 PM
 * 
 * Nov 16, 2020
 *
 */
package thread.learn._1_WayOfDefningThread.ByUsingRunable;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MyThread r = new MyThread();
		Thread t = new Thread(r);

		t.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Method");
		}
	}

}
