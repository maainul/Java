/**
 * @Author Md. Mainul Hasan
 * 
 * 9:22:19 PM
 * 
 * Nov 16, 2020
 *
 */
package thread.learn._2_gettingAndSettingAThreadName;

class MyThreadd extends Thread {
	public void run() {
		System.out.println("Run method executed by :" + Thread.currentThread().getName());
	}
}

public class ShowThreadName {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyThreadd t = new MyThreadd();
		t.start();
		System.out.println("Main method executed by :" + Thread.currentThread().getName());

	}

}
