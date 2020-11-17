/**
 * @Author Md. Mainul Hasan
 * 
 * 8:33:58 PM
 * 
 * Nov 16, 2020
 *
 */
package thread.learn._1_WayOfDefningThread.ByUsingThreadClass;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Mythread t = new Mythread();
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread");
		}

	}

}
