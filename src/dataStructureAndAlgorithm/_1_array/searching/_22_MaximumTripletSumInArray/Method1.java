package dataStructureAndAlgorithm._1_array.searching._22_MaximumTripletSumInArray;

/**
 * 
 * Maximum triplet sum in array
 * 
 * Given an array, the task is to find maximum triplet sum in the array.
 * 
 * Examples :
 * 
 * Input : arr[] = {1, 2, 3, 0, -1, 8, 10}
 * 
 * Output : 21
 * 
 * 10 + 8 + 3 = 21
 * 
 * Input : arr[] = {9, 8, 20, 3, 4, -1, 0}
 * 
 * Output : 37
 * 
 * 20 + 9 + 8 = 37
 * 
 **/

/*
 * Time complexity : O(n^3) Space complexity : O(1)
 */
public class Method1 {

	public static void main(String[] args) {
		int arr[] = { 1, 0, 8, 6, 4, 2 };
		int n = arr.length;
		System.out.println(maxTripletSum(arr, n));

	}

	private static int maxTripletSum(int[] arr, int n) {

		int triple_sum = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (triple_sum < arr[i] + arr[j] + arr[k]) {
						triple_sum = arr[i] + arr[j] + arr[k];
					}

				}
			}
		}

		return triple_sum;
	}

}
