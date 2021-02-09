/**
 * @Author Md. Mainul Hasan
 * 
 * 7:00:55 AM
 * 
 * Nov 4, 2020
 *
 */
package exceptionHandling;

public class Bunny {

	public static void main(String[] args) {
		try {
			eatCarrot();
		} catch (NoMoreCarrotException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void eatCarrot() throws NoMoreCarrotException {
		System.out.println("I love carrot");

	}

}
