/**
 * @Author Md. Mainul Hasan
 * 
 * 9:23:27 PM
 * 
 * Nov 13, 2020
 *
 */
package interviewQuestions.ThirdMaximumNumber;

public class _1_Problem {
	public static void thirdLargest(int[] arr, int n) {
		int first = arr[0];
		// find first largest element
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > first) {
				first = arr[i];
			}
		}

		// find second largest element
		int second = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > second && first > arr[i]) {
				second = arr[i];
			}
		}

		// find third largest element
		int third = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > third && arr[i] < second) {
				third = arr[i];
			}
		}

		System.out.println("Third Largest Index = " + third);
	}

	public static void main(String[] args) {
		int arr[] = { 12, 13, 1, 10, 34, 16 };
		int n = arr.length;
		thirdLargest(arr, n);

	}

}
