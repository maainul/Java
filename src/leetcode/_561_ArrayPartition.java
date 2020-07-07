/**************************************************************
561. Array Partition I -Easy

Given an array of 2n integers, 
your task is to group these integers into n pairs of integer, 
say (a1, b1), (a2, b2), ..., (an, bn) 
which makes sum of min(ai, bi) for all i from 1 to n as large as possible.

Example 1:
Input: [1,4,3,2]

Output: 4
Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).

Note:
n is a positive integer, which is in the range of [1, 10000].
All the integers in the array will be in the range of [-10000, 10000].



input = [1,2,3,4]
Then we have to group them into pairs. possible pairs are: (1,2), (1,3), (1,4), (2,3), (2,4), (3,4)
Now we want to find the maximum sum of (min of the pair). possible output sums are shown below:
( min(1,4) = 1 + min(2,3) = 2 ) = 3
( min(1,3) = 1 + min(2,4) = 2 ) = 3
( min(1,2) = 1 + min(3,4) = 3 ) = 4

Thus, output = 4 would give us the maximum sum of minimum pairs.

According to your pair (1, 4) and (2, 3),
( min(1,4) = 1 + min(2,3) = 2 ) = 3 //the output would be 3

*************************************************************************/
package leetcode;

import java.util.Arrays;

public class _561_ArrayPartition {

	public static void main(String[] args) {
		int[] nums = { 1, 5, 7, 6, 8, 4, 3, 2 };

		System.out.println(Arrays.toString(nums));
		System.out.println(arrayPairSum(nums));

		System.out.println(Arrays.toString(nums));
		System.out.println(arrayPairSum2(nums));

	}

	public static int arrayPairSum(int[] nums) {
		int sum = 0;
		Arrays.parallelSort(nums);
		System.out.println(Arrays.toString(nums));
		for (int i = 0; i < nums.length; i += 2) {
			sum += (Math.min(nums[i], nums[i + 1]));
		}
		return sum;
	}

	public static int arrayPairSum2(int[] nums) {
		int sum = 0;
		System.out.println(Arrays.toString(nums));
		Arrays.parallelSort(nums);

		for (int i = 0; i < nums.length; i += 2) {
			sum += nums[i];
		}
		return sum;
	}

}
