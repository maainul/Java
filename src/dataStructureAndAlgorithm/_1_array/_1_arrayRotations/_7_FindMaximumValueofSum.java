package dataStructureAndAlgorithm._1_array._1_arrayRotations;

/*
Input: arr[] = {1, 20, 2, 10}
Output: 72
We can 72 by rotating array twice.
{2, 10, 1, 20}
20*3 + 1*2 + 10*1 + 2*0 = 72

Input: arr[] = {10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
Output: 330
We can 330 by rotating array 9 times.
{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
0*1 + 1*2 + 2*3 ... 9*10 = 330
 */
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
