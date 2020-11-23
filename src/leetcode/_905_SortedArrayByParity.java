package leetcode;

import java.util.Arrays;

/*
905. Sort Array By Parity

Given an array A of non-negative integers, return an array consisting of all the even elements of A,
followed by all the odd elements of A.

You may return any answer array that satisfies this condition.

Example 1:

Input: [3,1,2,4]
Output: [2,4,3,1]
The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 */
public class _905_SortedArrayByParity {

	public static void main(String[] args) {
		int[] A = { 3, 1, 2, 4 };
		System.out.println(Arrays.toString(paritysort(A)));

	}

	private static int[] paritysort(int[] a) {
		int index = 0;
		int[] result = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				result[index++] = a[i];
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				result[index++] = a[i];
			}
		}
		return result;
	}
}
