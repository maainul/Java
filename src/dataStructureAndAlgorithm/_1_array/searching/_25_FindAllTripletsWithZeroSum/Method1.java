package dataStructureAndAlgorithm._1_array.searching._25_FindAllTripletsWithZeroSum;

/****
 * Input : arr[] = {0, -1, 2, -3, 1}
 * 
 * Output : (0 -1 1), (2 -3 1)
 * 
 * Explanation : The triplets with zero sum are
 * 
 * 0 + -1 + 1 = 0 and 2 + -3 + 1 = 0
 * 
 * Input : arr[] = {1, -2, 1, 0, 5}
 * 
 * Output : 1 -2 1
 * 
 * Explanation : The triplets with zero sum is
 * 
 * 1 + -2 + 1 = 0
 * 
 ****/
/*
 * Method 1: This is a simple method that takes O(n3) time to arrive at the
 * result.
 * 
 * Approach: The naive approach run three loops and check one by one that sum of
 * three elements is zero or not. If the sum of three elements is zero then
 * print elements otherwise print not found. Algorithm: Run three nested loops
 * with loop counter i, j, k The three loops will run from 0 to n-3 and second
 * loop from i+1 to n-2 and the third loop from j+1 to n-1. The loop counter
 * represents the three elements of the triplet. check if the sum of elements at
 * i’th, j’th, k’th is equal to zero or not. If yes print the sum else continue.
 */
public class Method1 {

	public static void main(String[] args) {
		int arr[] = { 0, -1, 2, -3, 1 };
		int n = arr.length;
		findTriplets(arr, n);

	}

	private static void findTriplets(int[] arr, int n) {
		boolean found = true;

		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				for (int k = 0; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {

						System.out.print(arr[i]);
						System.out.print(" ");
						System.out.print(arr[j]);
						System.out.print(" ");
						System.out.print(arr[k]);
						System.out.print("\n");
						found = true;
					}
				}
			}
			if (found == false) {
				System.out.println("no exists");
			}
		}

	}

}
