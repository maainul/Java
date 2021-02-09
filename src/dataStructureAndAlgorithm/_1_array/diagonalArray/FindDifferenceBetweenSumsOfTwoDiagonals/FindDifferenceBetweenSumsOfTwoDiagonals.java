package dataStructureAndAlgorithm._1_array.diagonalArray.FindDifferenceBetweenSumsOfTwoDiagonals;

/*

Given a matrix of n X n.

The task is to calculate the absolute difference between the sums of its diagonal.

Examples:

Input : mat[][] = 11 2 4
                   4 5 6
                  10 8 -12
Output : 15

Sum of primary diagonal = 11 + 5 + (-12) = 4.

Sum of primary diagonal = 4 + 5 + 10 = 19.

Difference = |19 - 4| = 15.


Input : mat[][] = 10 2
                   4 5
Output : 7

*/

public class FindDifferenceBetweenSumsOfTwoDiagonals {
	public static void main(String[] args) {
		int n = 3;

		int arr[][] = { { 11, 2, 4 }, { 4, 5, 6 }, { 10, 8, -12 } };

		System.out.print(difference(arr, n));

	}

	private static int difference(int[][] arr, int n) {

		int first = 0;
		int last = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					first += arr[i][j];
				}
				if ((i + j) == n - 1) {
					last += arr[i][j];
				}
			}
		}
		return Math.abs(first - last);
	}
}
