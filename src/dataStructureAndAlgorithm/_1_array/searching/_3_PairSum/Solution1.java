package dataStructureAndAlgorithm._1_array.searching._3_PairSum;
/*
Given an array A[] and a number x, check for pair in A[] with sum as x

Last Updated: 28-10-2020

Write a program that, given an array A[] of n numbers and another number x, d

determines whether or not there exist two elements in S whose sum is exactly x.

Examples:

Input: arr[] = {0, -1, 2, -3, 1}
        sum = -2
Output: -3, 1

If we calculate the sum of the output,

1 + (-3) = -2

Input: arr[] = {1, -2, 1, 0, 5}
       sum = 0

Output: -1

No valid pair exists.
 */
import java.util.Arrays;

//Java program to check if given array 
//has 2 elements whose sum is equal 
//to the given value 


public class Solution1 { 
	// Function to check if array has 2 elements 
	// whose sum is equal to the given value 
	static boolean hasArrayTwoCandidates( 
		int A[], 
		int arr_size, int sum) 
	{ 
		int l, r; 

		/* Sort the elements */
		Arrays.sort(A); 

		/* Now look for the two candidates 
		in the sorted array*/
		l = 0; 
		r = arr_size - 1; 
		while (l < r) { 
			if (A[l] + A[r] == sum) 
				return true; 
			else if (A[l] + A[r] < sum) 
				l++; 
			else // A[i] + A[j] > sum 
				r--; 
		} 
		return false; 
	} 

	// Driver code 
	public static void main(String args[]) 
	{ 
		int A[] = { 1, 4, 45, 6, 10, -8 }; 
		int n = 16; 
		int arr_size = A.length; 

		// Function calling 
		if (hasArrayTwoCandidates(A, arr_size, n)) 
			System.out.println("Array has two "
							+ "elements with given sum"); 
		else
			System.out.println("Array doesn't have "
							+ "two elements with given sum"); 
	} 
} 
