/*******************************************************************************
217. Contains Duplicate

Given an array of integers, find if the array contains any duplicates.

Your function should return true if any value appears at least twice in the array, 
and it should return false if every element is distinct.

Example 1:

	Input: [1,2,3,1]
	Output: true
	Example 2:
	
	Input: [1,2,3,4]
	Output: false
	Example 3:

Input: [1,1,1,3,3,4,3,2,4,2]
Output: true 
*********************************************************************************/


package leetcode.array;

import java.util.HashSet;

public class _217_ContainsDuplicate {

	public static void main(String[] args) {
		System.out.println("136. Contains Duplicate (Easy)");
		int[] nums = {1,2,3,1};
		
		System.out.println(solutions(nums));

	}

	private static boolean solutions(int[] nums) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if(set.contains(nums[i])) {
				return true;
			}
			set.add(nums[i]);
		}
		return false;
		//System.out.println(set);
	}
}
