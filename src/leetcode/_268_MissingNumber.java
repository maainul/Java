/***********************************************************************
268. Missing Number (Easy)

Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, 
Find the one that is missing from the array.

Example 1:
	Input: [3,0,1]
	Output: 2
	
Example 2:
	Input: [9,6,4,2,3,5,7,0,1]
	Output: 8
	
Note:
	Your algorithm should run in linear runtime complexity. 
	Could you implement it using only constant extra space complexity?

**************************************************************************/

package leetcode;

import java.util.Arrays;

public class _268_MissingNumber{

	public static void main(String[] args) {
		System.out.println("268. Missing Number (Easy)");
		int[] nums = {3,0,1};
		//// Java Solution 1 - Math
		//System.out.println(missingNumber(nums));
		
		//Java Solution 2 - Bit
		//System.out.println(missingNumberBit(nums));
		
		//Java Solution 3 - Binary Search
		//System.out.println(missingNumberBinarySearchMethod(nums));

		System.out.println(missing(nums));

		
	}
	// Java Solution 1 - Math
	public static int missingNumber(int[] nums) {
	    int sum=0;
	    for(int i=0; i<nums.length; i++){
	        sum= sum+ nums[i];
	    }
	    int n=nums.length;
	    return n*(n+1)/2-sum;
	}

    public static int missing(int[] nums) {
        int result = 0;
        for(int i = 0; i< nums.length+1; i++){
            result += i;
        }

        for(int i = 0; i < nums.length; i++){
            result -= nums[i];
        }
        return result;
    }
	
	// Java Solution 3 - Binary Search
	public static int missingNumberBinarySearchMethod(int[] nums) {
		   Arrays.sort(nums);
		   int l=0, r=nums.length;
		   while(l<r){
		       int m = (l+r)/2;
		       if(nums[m]>m){
		           r=m;
		       }else{
		           l=m+1;
		       }
		   }
		 
		   return r;
		}

}


