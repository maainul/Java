package dataStructureAndAlgorithm._1_array._1_arrayRotations;

import java.util.Arrays;

public class _7_FindMaximumValueofSum {

	public static void main(String[] args) {
		int arr[] = { 10, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(findSum(arr));

	}

	private static int findSum(int[] arr) {
		int arrSum = 0;
		int currSum = 0;

		for (int i = 0; i < arr.length; i++) {
			arrSum = arrSum + arr[i];
			currSum = currSum + (i * arr[i]);
		}

		int maxVal = currSum;

		for (int i = 1; i < arr.length; i++) {
			currSum = currSum + arrSum - arr.length * arr[arr.length - i];
			if (currSum > maxVal) {
				maxVal = currSum;
			}
		}
		return maxVal;
	}

}
