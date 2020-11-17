/**
 * @Author Md. Mainul Hasan
 * 
 * 9:18:30 PM
 * 
 * Nov 16, 2020
 *
 */
package thread.learn._2_gettingAndSettingAThreadName;

public class Main {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		MyThread t = new MyThread();
		System.out.println(t.getName());
		Thread.currentThread().setName("Anik Thread");
		System.out.println(Thread.currentThread().getName());

	}

}
