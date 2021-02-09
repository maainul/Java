package leetcode;

/*
 674. Longest Continuous Increasing Subsequence

Example 1:
Input: [1,3,5,4,7]
Output: 3
Explanation: The longest continuous increasing subsequence is [1,3,5], its length is 3. 

Even though [1,3,5,7] is also an increasing subsequence, 
it's not a continuous one where 5 and 7 are separated by 4. 

Example 2:
Input: [2,2,2,2,2]
Output: 1
Explanation: The longest continuous increasing subsequence is [2], its length is 1. 
 */
public class _674_LongestContiguousIncreasingSubsequence {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 1, 9, 5, 7 };
		System.out.println(findLengthOfLCIS(nums));

	}

	public static int findLengthOfLCIS(int[] nums) {
		if (nums.length == 0)
			return 0;
		if (nums.length == 1)
			return 1;
		int length = 1;
		int temp = 1;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] < nums[i + 1]) {
				temp++;
				length = Math.max(length, temp);
			} else {
				temp = 1;
			}
		}
		return length;
	}
}
