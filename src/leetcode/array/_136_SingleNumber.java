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
	
	
	Approach 4: Bit Manipulation
*****************************************************************/
package leetcode.array;

public class _136_SingleNumber {

	public static void main(String[] args) {
		System.out.println("136. Single Number (Easy)");
		
		int[] nums = {2,2,1};
		System.out.println(singleNumber(nums));

	}

	private static int singleNumber(int[] nums) {
		       int num = 0;
		       for(int i = 0; i< nums.length; i++){
		           num ^= nums[i];
		       } 
		        return num;
		    }
		
	
}
