package dataStructureAndAlgorithm._1_array.FindPairWithGivenSumInAnArray;

import java.util.Arrays;

// Time Complexity : O(nlogn)

public class _2_TwoPointerAndSorting {

	public static void main(String[] args) {
		int[] arr = { 8, 7, 2, 5, 3, 1 };
		int sum = 10;
		sumArray(arr, sum);

	}

	private static void sumArray(int[] arr, int sum) {
		Arrays.parallelSort(arr);
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			if (arr[left] + arr[right] == sum) {
				System.out.println("found index" + left + " " + right);
				return;
			}
			if (arr[left] + arr[right] > sum) {
				right--;

			} else {
				left++;
			}

		}

	}
}
