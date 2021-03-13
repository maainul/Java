package interviewQuestions;

import java.util.Arrays;

/*
628. Maximum Product of Three Numbers

Given an integer array, find three numbers whose product is maximum and output the maximum product.

Example 1:

Input: [1,2,3]
Output: 6
 

Example 2:

Input: [1,2,3,4]
Output: 24

 */
public class _628_MaximuxProductOfThreeNumber {

	private static int maximumProduct(int[] nums) {
		int len = nums.length;

		if (len < 3) {
			return -1;
		}

		int max_product = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length - 2; i++) {
			for (int j = i + 1; j < nums.length - 1; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					max_product = Math.max(max_product, nums[i] * nums[j] * nums[k]);
				}
			}
		}

		return max_product;
	}

	public static int maximumProducts(int[] nums) {
		Arrays.sort(nums);
		int len = nums.length;
		return Math.max(nums[0] * nums[1] * nums[len - 1], nums[len - 1] * nums[len - 2] * nums[len - 3]);
	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4 };
		System.out.println(maximumProduct(nums));

		System.out.println(maximumProducts(nums));

	}

}
