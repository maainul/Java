package dataStructureAndAlgorithm._1_array;

import java.util.Arrays;

/*
Alternative Sorting

Given an array of integers, 
print the array in such a way that the first element is first maximum and second element is first minimum and so on.

Examples :

Input : arr[] = {7, 1, 2, 3, 4, 5, 6}
Output : 7 1 6 2 5 3 4

Input : arr[] = {1, 6, 9, 4, 3, 7, 8, 2}
Output : 9 1 8 2 7 3 6 4

A simple solution is to first print maximum element, 
then minimum, then second maximum, and so on. 
Time complexity of this approach is O(n2).

An efficient solution involves following steps.
1) Sort input array using a O(n Log n) algorithm.
2) We maintain two pointers, one from beginning and one from end in sorted array. 
We alternatively print elements pointed by two pointers and move them toward each other.
 */
public class _1_AlternativeSort {

	public static void main(String[] args) {
		int nums[] = {7,4,3,2,1,6};
		alternativeSortMethod(nums);
		
	}

	private static void alternativeSortMethod(int[] nums) {
		int n = nums.length;
		Arrays.sort(nums);
		int first = 0;
		int last = n -1;
		while (first < last) {
			System.out.print(nums[last--]+" ");
			System.out.print(nums[first++]+" ");
		}
		
	}

}
