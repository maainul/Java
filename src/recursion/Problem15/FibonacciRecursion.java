/******************************************************************************

Write a recursive program to print fibonacci series. 1st and 2nd fibonacci numbers are 1, 1.

Input:
6
Output:
1 1 2 3 5 8 

*******************************************************************************/
package recursion.Problem15;

public class FibonacciRecursion {
	public static void main(String args[]) {
		int x, y, n;
		x = 1;
		y = 1;
		n = 9;
		System.out.print("1 1 ");
		recurs(x, y, n);
		System.out.print("\n1 1");
		fibonacci(x, y, n);
		System.out.println();
		System.out.println(newfibonacci(9));
	}

	// sum of all fibonacci
	public static int newfibonacci(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}

		return newfibonacci(number - 1) + newfibonacci(number - 2); // tail recursion
	}

	// preferable solution // new solution
	public static void fibonacci(int x, int y, int n) {
		int z;
		if (n == 2) {
			System.out.println("\nsum " + y);
			return;
		}
		z = x + y;
		System.out.print(" " + z);
		x = y;
		y = z;
		fibonacci(x, y, n - 1);
	}

	public static void recurs(int x, int y, int n) {
		int z;
		if (n > 2) {
			z = x + y;
			System.out.print(" " + z);
			x = y;
			y = z;
			recurs(x, y, n - 1);
		}
	}
}
