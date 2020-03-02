/*
88. Merge Sorted Array

	Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
	
	Note:
	
	The number of elements initialized in nums1 and nums2 are m and n respectively.
	You may assume that nums1 has enough space (size that is greater or equal to m + n) 
	to hold additional elements from nums2.
	
	Example:
	
	Input:
		nums1 = [1,2,3,0,0,0], m = 3
		nums2 = [2,5,6],       n = 3
		
		Output: [1,2,2,3,5,6]
		
*/

package leetcode.array;

import java.util.Arrays;

public class _88_MergeTwoArray {
	public static void main(String[] args) {

		int nums1[] = { 1, 2, 3, 0, 0, 0 };
		int nums2[] = { 2, 5, 6 };

		int m = 3;
		int n = 3;

		mergeArray(nums1, nums2, m, n);

	}

	public static void mergeArray(int[] nums1, int[] nums2, int m, int n) {
		int index = 0;
		for (int i = m; i < m + n; i++) {
			nums1[i] = nums2[index++];
		}
		Arrays.sort(nums1);
		System.out.println(Arrays.toString(nums1));
	}
}
