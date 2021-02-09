package leetcode;

import java.util.Arrays;

/*
532. K-diff Pairs in an Array

Given an array of integers and an integer k, you need to find the number of unique 

k-diff pairs in the array.

Here a k-diff pair is defined as an integer pair (i, j),

where i and j are both numbers in the array and their absolute difference is k.

Example 1:

Input: [3, 1, 4, 1, 5], k = 2

Output: 2

Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).

Although we have two 1s in the input, we should only return the number of unique pairs.

Example 2:

Input:[1, 2, 3, 4, 5], k = 1

Output: 4

Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).

Example 3:

Input: [1, 3, 1, 5, 4], k = 0

Output: 1

Explanation: There is one 0-diff pair in the array, (1, 1).
 */

public class _532_KDiffElement {
	public static void main(String[] args) {
		int nums[] = { 1, 5, 3, 1, 4 };

		int k = 2;
		// System.out.println(kdiff(nums, k));
		System.out.println(findPairs(nums, k));

		System.out.println(kdiff(nums, k));
	}

	// Method 1
	// This solution doesn’t work if there are duplicates in array as the
	// requirement is to count only distinct pairs.
	private static int kdiff(int[] nums, int k) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] - nums[j] == k || nums[j] - nums[i] == k) {
					count++;
				}
			}
		}
		return count;
	}

	public static int findPairs(int[] nums, int k) {
		if (k < 0)
			return 0;

		Arrays.sort(nums);

		int left = 0, right = 1, count = 0;
		while (right < nums.length) {
			if (nums[right] - nums[left] > k) {
				left++;
			} else if (nums[right] - nums[left] < k || right == left) {
				right++;
			} else {
				count++;
				left++;
				right++;
				while (right < nums.length && nums[right] == nums[right - 1])
					right++;
			}
		}
		return count;
	}
}
