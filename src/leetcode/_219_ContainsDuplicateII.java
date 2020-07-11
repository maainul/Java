/*******************************************************************************************
 219. Contains Duplicate II (Easy)

Given an array of integers and an integer k, find out whether 

there are two distinct indices i and j in the array such that 

nums[i] = nums[j] and 

the absolute difference between i and j is at most k.

Example 1:
	Input: nums = [1,2,3,1], k = 3
	Output: true
	
Example 2:
	Input: nums = [1,0,1,1], k = 1
	Output: true
	
Example 3:
	Input: nums = [1,2,3,1,2,3], k = 2
	Output: false
 */

package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class _219_ContainsDuplicateII{

	public static void main(String[] args) {
		int nums[] = {1,2,3,1};
		int k = 3;
		System.out.println(solution(nums, k));
		System.out.println(solutionHashSet(nums, k));
		
		
	}
	// solution 1
	private static boolean solutionHashSet(int[] nums, int k) {
		//creates an empty hashset
		HashSet<Integer> set = new HashSet<Integer>();
		
		// Traverse the input array
		for (int i = 0; i < nums.length; i++) {
			
			// If already present n hash, then we found
			// a duplicate within k distance
			// value ki duplicate ache jodi thake tahole return true
			// Is the duplicate value contain ---------yes(so, return true)
			// Is the duplicate value not contain -------(return false)
			if(set.contains(nums[i]))
				return true;
			
			// Add this item to hasset
			set.add(nums[i]);
			
			// Remove the k+1 distant item.
			if(i >= k) {
				set.remove(nums[i-k]);
			}
		}
		return false;
	}
	// solution 2
	private static boolean solution(int[] nums, int k) {
		Arrays.parallelSort(nums); // 1 1 2 3
		if(nums.length == 1) {
			return false;
		}
		for (int i = 1; i < nums.length; i++) {
			if(nums[i-1] == nums[i]) {
				return true;
			}
			
		}
		return false;
		
	} 

}
