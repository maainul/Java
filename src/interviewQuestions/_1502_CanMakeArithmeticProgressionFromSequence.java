/**
 * @Author Md. Mainul Hasan
 * 
 * 3:31:03 AM
 * 
 * Sep 28, 2020
 *
 */
package interviewQuestions;

import java.util.Arrays;

public class _1502_CanMakeArithmeticProgressionFromSequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 1, 3, 5 };
		System.out.println(canMakeArithmeticProgression(arr));

	}

	public static boolean canMakeArithmeticProgression(int[] arr) {

		Arrays.sort(arr);
		int commonSequence = arr[1] - arr[0];
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i + 1] - arr[i] != commonSequence) {
				return false;
			}
		}
		return true;
	}

}
