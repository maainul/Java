/***************************************************************
136. Single Number (Easy)

	Given a non-empty array of integers, every element appears twice except for one. 
	Find that single one.
	
	Note:
	
	Your algorithm should have a linear runtime complexity. 
	Could you implement it without using extra memory?
	
	Example 1:
	
	Input: [2,2,1]
	Output: 1
	Example 2:
	
	Input: [4,1,2,1,2]
	Output: 4
*****************************************************************/
package leetcode.array;

public class _136_SingleNumber {

	public static void main(String[] args) {
		System.out.println("136. Single Number (Easy)");
		
		int[] nums = {1,1,5,1,2};
		singleNumber(nums);

	}

	private static void singleNumber(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < nums.length; j++) {
				if(nums[i] == nums[j]) {
					System.out.println("ace");
				}
			}
		}
		
	}

}
