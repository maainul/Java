/************************************************************************* 
1. Two Sum-(Easy)

Given an array of integers, return indices of the two numbers such that 
they add up to a specific target.

You may assume that each input would have exactly one solution, 
and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
***************************************************************************/
package interviewQuestions.leetcode;

public class _1_TwoSum {

	public static int[] twosumsolution(int nums[], int target) {
		int[] result = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					result[0] = i;
					result[1] = j;
				}
			}
		}
		return result;
	}

	public static int[] twoSum(int[] numbers, int target) {
		int a_pointer = 0;
		int b_pointer = numbers.length - 1;
		while (a_pointer < b_pointer) {
			int sum = numbers[a_pointer] + numbers[b_pointer];
			if (sum > target) {
				b_pointer--;
			} else if (sum < target) {
				a_pointer++;
			} else {
				return new int[] { a_pointer + 1, b_pointer + 1 };
			}
		}
		return null;
	}

	public static void main(String args[]) {
		int[] nums = { 2, 5, 9, 11, 7, 13 };// declaration and instantiation
		int target = 13;
		int[] result = twosumsolution(nums, target);

		if (result.length == 2) {
			System.out.println(result[0] + "  " + result[1]);
		} else {
			System.out.println("No solution found...");
		}
		System.out.println();

		System.out.println("Two pointer Implementation");
		int res[] = twoSum(nums, 15);
		System.out.println(res[0] + " and " + res[1]);
	}
}
