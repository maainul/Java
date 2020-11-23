package recursion.Problem16;

public class Fibonacci {
	public static void main(String[] args) {
		int a = 1, b = 1, n = 6;
		fibonacciRecursive(a, b, n);
		// 1 1 2 3 5 8
		// ans is = 8
	}

	private static void fibonacciRecursive(int a, int b, int n) {
		if (n == 2) {
			System.out.println(b);
			return;
		}
		int c;
		c = a + b;
		a = b;
		b = c;
		fibonacciRecursive(a, b, n - 1);

	}

}