/************************************************************
448. Find All Numbers Disappeared in an Array Easy


Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements of [1, n] inclusive that do not appear in this array.

Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

Example:

	Input:
	[4,3,2,7,8,2,3,1]
	
	Output:
	[5,6]

 ***********************************************************/
package interviewQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class _448_FindAllNumbersDisappreadAnArray {

	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> missingNumber = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}

		for (int i = 1; i <= nums.length; i++) {
			if (!set.contains(i)) {
				missingNumber.add(i);
			}
		}
		return missingNumber;
	}

	public static void main(String args[]) {
		System.out.println("448. Find All Numbers Disappeared in an Array Easy\n ");

		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };

		// return method
		System.out.println("Return value");
		System.out.println(findDisappearedNumbers(nums));

	}
}
