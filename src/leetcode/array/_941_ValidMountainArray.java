/*********************************************************************************
941. Valid Mountain Array (Easy)

Given an array A of integers, return true if and only if it is a valid mountain array.

Recall that A is a mountain array if and only if:

A.length >= 3

There exists some i with 0 < i < A.length - 1 such that:
	A[0] < A[1] < ... A[i-1] < A[i]
	A[i] > A[i+1] > ... > A[A.length - 1]


 

	Example 1:
	
	Input: [2,1]
	Output: false
	Example 2:
	
	Input: [3,5,5]
	Output: false
	Example 3:
	
	Input: [0,3,2,1]
	Output: true
	 
	
	Note:
	
	0 <= A.length <= 10000
	0 <= A[i] <= 10000 
***********************************************************************************/
package leetcode.array;

public class _941_ValidMountainArray {
	public static void main(String[] args) {
	
	
	System.out.println("941. Valid Mountain Array (Easy)");
	
	int[] nums = {3,5,5};
	
	System.out.println("\nInput :");
	for (int i = 0; i < nums.length; i++) {
		System.out.print(nums[i]+" ");
	}
	
	System.out.println("\n\nOutput :");
	
	System.out.println(validMountainArray(nums));	 

	}

	private static boolean validMountainArray(int[] nums) {
		// TODO Auto-generated method stub
		return false;
	}
}
