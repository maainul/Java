//Find the sum of the integers from 1 through n.
// sum of integers :10
package recursion.Problem8;

public class SumOfIntegerFromOneToNthUsingRecursion {
	public static void main(String[] args) {
		int sum = 0;
		sumofarray(sum, 0, 4);
		sumofn(sum, 0, 5);
	}

	// preferable solution
	private static void sumofn(int sum, int i, int n) {
		sum += i;
		if (i == n) {
			System.out.println(sum);
			return;
		}
		sumofn(sum, i + 1, n);

	}

	public static void sumofarray(int sum, int i, int end) {
		sum = sum + i;
		if (i == end) {
			System.out.println("sum of integers :" + sum);
			return;
		} else {
			sumofarray(sum, i + 1, end);
		}

	}

}
