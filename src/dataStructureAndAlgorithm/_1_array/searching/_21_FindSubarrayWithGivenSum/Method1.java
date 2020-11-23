package dataStructureAndAlgorithm._1_array.searching._21_FindSubarrayWithGivenSum;

/********
 * 
 * Given an unsorted array of nonnegative integers, find a continuous subarray
 * which adds to a given number.
 * 
 * Examples :
 * 
 * Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
 * 
 * Ouptut: Sum found between indexes 2 and 4
 * 
 * Sum of elements between indices
 * 
 * 2 and 4 is 20 + 3 + 10 = 33
 * 
 * Input: arr[] = {1, 4, 0, 0, 3, 10, 5}, sum = 7
 * 
 * Ouptut: Sum found between indexes 1 and 4
 * 
 * Sum of elements between indices
 * 
 * 1 and 4 is 4 + 0 + 0 + 3 = 7
 * 
 * Input: arr[] = {1, 4}, sum = 0
 * 
 * Output: No subarray found
 * 
 * There is no subarray with 0 sum
 * 
 ********************/
/*
Traverse the array from start to end.

From every index start another loop from i to the end of array to get all subarray starting from i, 

keep a varibale sum to calculate the sum.

For every index in inner loop update sum = sum + array[j]

If the sum is equal to the given sum then print the subarray.
 */

public class Method1 {

	private static int subArraySum(int[] arr, int n, int sum) {
		int cur_sum, i, j;
		for (i = 0; i < arr.length; i++) {
			cur_sum = arr[i];
			for (j = i + 1; j < arr.length; j++) {
				if (cur_sum == sum) {
					int p = j-1;
					System.out.println("Sum found between indexes "+i+" to " +p);
					return 1;
				}
				if (cur_sum > sum || j == n) {
					break;
				}
				cur_sum = cur_sum + arr[j];
			}
		}
		System.out.println("No subArray Found..");
		return 0;
	}

	public static void main(String[] args) {
		int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
		int n = arr.length;
		int sum = 23;
		subArraySum(arr, n, sum);

	}

}
