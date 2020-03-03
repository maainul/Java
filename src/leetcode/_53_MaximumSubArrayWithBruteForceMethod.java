package leetcode;

/*
    53. Maximum Subarray

	Given an integer array nums, 
	find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

	Example:
	
	Input: [-2,1,-3,4,-1,2,1,-5,4],
	Output: 6
	Explanation: [4,-1,2,1] has the largest sum = 6.
	
 */
import java.util.Scanner;
 
public class _53_MaximumSubArrayWithBruteForceMethod
{
    public static void main(String[] args) 
    {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    	
    }
   
    public int maxSubArray(int[] nums) {
        int msf = Integer.MIN_VALUE;
        int meh = 0;
        for(int i = 0; i<nums.length;i++){
            meh +=nums[i];
            if(meh < nums[i]){
                meh = nums[i];
            }
            if(msf < meh){
                msf = meh;
            }
        }
        return msf;
    }
}