/************************************************************
414. Third Maximum Number (Easy)

Given a non-empty array of integers, 
return the third maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n).

	Example 1:
	Input: [3, 2, 1]

	Output: 1

	Explanation: The third maximum is 1.
	Example 2:
	Input: [1, 2]

	Output: 2

Explanation: The third maximum does not exist, so the maximum (2) 
is returned instead.

Example 3:
Input: [2, 2, 3, 1]

Output: 1

Explanation: Note that the third maximum here means the third maximum distinct number.
Both numbers with value 2 are both considered as second maximum.

 ***********************************************************/

package leetcode.array;

public class _414_ThirdMaximumNumber {

	public static void main(String[] args) {
		System.out.println("414. Third Maximum Number (Easy)");

		int[] nums = { 12, 16, 15};

		System.out.println("\nInput :");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}

		System.out.println("\n\nOutput :");

		System.out.println(thirdMax(nums));

	}

	public static int thirdMax(int[] nums) {
		Integer First = null;
		Integer Second = null;
		Integer Third = null;

		for (Integer value : nums) {
			if (value.equals(First) || value.equals(Second) || value.equals(Third))
				continue;
			if (First == null || value > First) {
				Third = Second;
				Second = First;
				First = value;
			} else if (Second == null || value > Second) {
				Third = Second;
				Second = value;
			} else if (Third == null || value > Third) {
				Third = value;
			}
		}

		return Third == null ? First : Third;
	}
}
