/******************************************************************************

Write a recursive program to print fibonacci series. 1st and 2nd fibonacci numbers are 1, 1.

Input:
6
Output:
1 1 2 3 5 8 

*******************************************************************************/
package recursion.Problem14;

public class Fibonacci {
	public static void main(String[] args) {
		fibonacci(5);
		System.out.println();
		fibonaccimethod2(5);
	}

	private static void fibonaccimethod2(int n) {
		int x = 1;
		int y = 1;
		int z;
		System.out.print("1 1");
		for (int i = 2; i < n; i++) {
			z = x + y;
			System.out.print(" " + z);
			x = y;
			y = z;
		}

	}

	private static void fibonacci(int n) {
		int a = 1;
		int b = 1;
		int c = 0;
		System.out.print("1 1 ");
		for (int i = 2; i < n; i++) {
			// 1 1 2 3 5 8
			c = a + b;
			a = b;
			b = c;
			System.out.print(b + " ");
		}
	}
}
