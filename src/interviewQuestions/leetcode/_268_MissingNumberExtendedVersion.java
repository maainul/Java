/***********************************************************************
268. Missing Number (Easy)

Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, 
Find the one that is missing from the array.

Example 1:
	Input: [13,10,11]
	Output: 12
 
Note:
	Your algorithm should run in linear runtime complexity. 
	Could you implement it using only constant extra space complexity?

**************************************************************************/

package interviewQuestions.leetcode;

import java.util.Arrays;

public class _268_MissingNumberExtendedVersion {

	public static void main(String[] args) {
		// test case 1
		// int[] nums = {10,13,9,8,5,7,11,6,4};

		// test case 2
		// int[] nums = {0,2}; // return 1

		// test case 3
		// int[] nums = {0}; return 1

		// test case 4
		int[] nums = { 0, 3, 1 };
		// int[] nums = {0};
		System.out.println("Missing advance");
		// 1.unsorted
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println("\n\nAfter Sorted");
		// 2.sorted
		Arrays.parallelSort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		// form index 1
		System.out.println("\nleft elements");
		for (int i = 1; i < nums.length; i++) {
			System.out.print(nums[i - 1] + " ");
		}
		// from i elements
		System.out.println("\nI right elements");
		for (int i = 1; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println("\nMissing Value:");
		System.out.println(missingNumber(nums));
	}

	private static int missingNumber(int[] nums) {
		int sum = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] - nums[i - 1] == 2) {
				sum = (nums[i] + nums[i - 1]) / 2;
			}
		}
		return sum;

	}
}