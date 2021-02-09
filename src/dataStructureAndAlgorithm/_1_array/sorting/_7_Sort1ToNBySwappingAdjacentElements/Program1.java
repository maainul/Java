package dataStructureAndAlgorithm._1_array.sorting._7_Sort1ToNBySwappingAdjacentElements;

import java.util.Arrays;

/*
Given an array, A of size N consisting of elements 1 to N.

A boolean array B consisting of N-1 elements indicates that if B[i] is 1, 

then A[i] can be swapped with A[i+1].

Find out if A can be sorted by swapping elements.

Examples:

Input : A[] = {1, 2, 5, 3, 4, 6}

        B[] = {0, 1, 1, 1, 0}
        
Output : A can be sorted

We can swap A[2] with A[3] and then A[3] with A[4].

Input : A[] = {2, 3, 1, 4, 5, 6}

        B[] = {0, 1, 1, 1, 1}
        
Output : A can not be sorted

We can not sort A by swapping elements as 1 can never be swapped with A[0]=2.

 */
public class Program1 {
	// Driver program to test sortedAfterSwap()
	public static void main(String[] args) {
		int A[] = { 1, 2, 5, 3, 4, 6 };
		boolean B[] = { false, true, true, true, false };
		int n = A.length;

		if (sortedAfterSwap(A, B, n)) {
			System.out.println("A can be sorted");
		} else {
			System.out.println("A can not be sorted");
		}

	}

	private static boolean sortedAfterSwap(int[] A, boolean[] B, int n) {
		int i, j;

		// Check bool array B and sorts
		// elements for continuous sequence of 1
		for (i = 0; i < n - 1; i++) {
			System.out.println(i + "  " + B[i]);
			if (B[i]) {
				j = i;
				System.out.println(j + "  " + B[j]);
				while (B[j]) {
					j++;
				}
				// Sort array A from i to j
				Arrays.sort(A, i, 1 + j);
				i = j;
			}
		}

		// Check if array is sorted or not
		for (i = 0; i < n; i++) {
			if (A[i] != i + 1) {
				return false;
			}
		}

		return true;
	}
}
