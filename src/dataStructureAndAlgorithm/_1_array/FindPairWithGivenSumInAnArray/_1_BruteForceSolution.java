package dataStructureAndAlgorithm._1_array.FindPairWithGivenSumInAnArray;

/*
 arr = {8,7,2,5,3,1}
 sum = 10
 
 Time Complexity : O(n*n)
 */

public class _1_BruteForceSolution {

	public static void main(String[] args) {
		int[] arr = { 8, 7, 2, 5, 3, 1 };
		int sum = 10;
		sumArray(arr, sum);

	}

	private static void sumArray(int[] arr, int sum) {
		int i, j = 0;
		for (i = 0; i < arr.length - 1; i++) {
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum) {
					System.out.println(i + " " + j);
					return;
				}
			}
		}
		System.out.println("Not found");

	}

}
