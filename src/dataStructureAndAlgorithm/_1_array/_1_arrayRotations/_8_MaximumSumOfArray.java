package dataStructureAndAlgorithm._1_array._1_arrayRotations;

/*

Maximum sum of i*arr[i] among all rotations of a given array

Given an array arr[] of n integers, 

find the maximum that maximizes the sum of the value of i*arr[i] where i varies from 0 to n-1.

Examples:

Input: arr[] = {8, 3, 1, 2}
Output: 29
Explanation: Lets look at all the rotations,
{8, 3, 1, 2} = 8*0 + 3*1 + 1*2 + 2*3 = 11
{3, 1, 2, 8} = 3*0 + 1*1 + 2*2 + 8*3 = 29
{1, 2, 8, 3} = 1*0 + 2*1 + 8*2 + 3*3 = 27
{2, 8, 3, 1} = 2*0 + 8*1 + 3*2 + 1*1 = 17

Input: arr[] = {3, 2, 1}
Output: 7
Explanation: Lets look at all the rotations,
{3, 2, 1} = 3*0 + 2*1 + 1*2 = 4
{2, 1, 3} = 2*0 + 1*1 + 3*2 = 7
{1, 3, 2} = 1*0 + 3*1 + 2*2 = 7 

 */
//A Naive Java program to find 
//maximum sum rotation 

public class _8_MaximumSumOfArray {

//Returns maximum value of i*arr[i] 
	static int maxSum(int arr[], int n) {
//Initialize result 
		int res = Integer.MIN_VALUE;

//Consider rotation beginning with i 
//for all possible values of i. 
		for (int i = 0; i < n; i++) {

			// Initialize sum of current rotation
			int curr_sum = 0;

			// Compute sum of all values. We don't
			// actually rotation the array, but compute
			// sum by finding ndexes when arr[i] is
			// first element
			for (int j = 0; j < n; j++) {
				int index = (i + j) % n;
				curr_sum += j * arr[index];
			}

			// Update result if required
			res = Math.max(res, curr_sum);
		}

		return res;
	}

//Driver code 
	public static void main(String args[]) {
		int arr[] = { 8, 3, 1, 2 };
		int n = arr.length;
		System.out.println(maxSum(arr, n));
	}

}

//This code is contributed by Sahil_Bansall 
