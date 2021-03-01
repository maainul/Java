package interviewQuestions.leetcode;

import java.util.Arrays;

public class _977_SquareOfSortedArray {

	public static void main(String[] args) {
		int A[] = { -7, -3, 2, 3, 11 };
		System.out.println("Original Arrays :" + Arrays.toString(A));
		squareofSortedArray(A);

		System.out.println("Sorted Array : " + Arrays.toString(A));
	}

	public static void squareofSortedArray(int A[]) {
		for (int i = 0; i < A.length; i++) {
			A[i] = A[i] * A[i];
		}
		Arrays.parallelSort(A);

	}

}
