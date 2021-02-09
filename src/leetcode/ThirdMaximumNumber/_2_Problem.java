/**
 * @Author Md. Mainul Hasan
 * 
 * 9:25:48 PM
 * 
 * Nov 13, 2020
 *
 */
package leetcode.ThirdMaximumNumber;

public class _2_Problem {

	public static void main(String[] args) {
		int arr[] = { 12, 13, 1, 10, 34, 16 };
		int n = arr.length;
		thirdLargest(arr, n);

	}

	private static void thirdLargest(int[] arr, int n) {
		/* There should be atleast three elements */
		if (n < 3) {
			System.out.println("Invalid Input");
			return;
		}

		// Initialized first, second and third largest element
		int first = arr[0], second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;

		// Traverse array element to find the third Largest
		for (int i = 1; i < arr.length; i++) {
			// if current element is greater than first,
			// than update first second and third
			if (arr[i] > first) {
				third = second;
				second = first;
				first = arr[i];
			}
			// if arr[i] is in between first and second
			else if (arr[i] > second) {
				third = second;
				second = arr[i];
			} else if (arr[i] > third) {
				third = arr[i];
			}
		}
		System.out.println("Third largest element is = " + third);

	}
}
