package leetcode;

import java.util.Arrays;

/*

1299. Replace Elements with Greatest Element on Right Side


Given an array arr, replace every element in that array with the greatest element among 

the elements to its right, and replace the last element with -1.

After doing so, return the array.

 

Example 1:

Input: arr = [17,18,5,4,6,1]

Output: [18,6,6,6,1,-1]
 

Constraints:

    1 <= arr.length <= 10^4
    1 <= arr[i] <= 10^5


 */
public class _1299_ReplaceElements {

	public static void main(String[] args) {
		int[] arr = { 17, 18, 5, 4, 6, 1 };
		System.out.println(Arrays.toString(arr));
		int[] result = replaceElement(arr);

		System.out.println(Arrays.toString(result));

		System.out.println();
		int[] result2 = replaceElement2(arr);

		System.out.println(Arrays.toString(result2));

	}

	private static int[] replaceElement2(int[] arr) {
		int len = arr.length - 1;
		int[] result = new int[len];
		int max_from_right = -1;
		for (int i = len - 1; i >= 0; i--) {
			result[i] = max_from_right;
			max_from_right = Math.max(arr[i], max_from_right);
		}
		return result;
	}

	// Brute force approach
	private static int[] replaceElement(int[] arr) {
		int max = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					max = arr[j];
				}
			}
			arr[i] = max;
		}
		return arr;
	}

}
