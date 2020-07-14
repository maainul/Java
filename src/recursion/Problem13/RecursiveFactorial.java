/******************************************************************************

Write a recursive program to compute n!
Input:
5
Output:
120

*******************************************************************************/
package recursion.Problem13;

public class RecursiveFactorial {
	public static void main(String[] args) {
		int fact = 1;
		factorial(fact, 1, 4);
	}

	private static void factorial(int fact, int start, int end) {
		fact = fact * end;
		if (start == end) {
			System.out.println(fact);
			return;
		}
		factorial(fact, start, end - 1);
	}
}
