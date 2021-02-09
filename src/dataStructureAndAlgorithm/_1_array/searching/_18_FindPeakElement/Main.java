package dataStructureAndAlgorithm._1_array.searching._18_FindPeakElement;

/*
Find a peak element

Last Updated: 14-12-2020

Given an array of integers. Find a peak element in it.

An array element is a peak if it is NOT smaller than its neighbours.

For corner elements, we need to consider only one neighbour.

Example:

Input: array[]= {5, 10, 20, 15}
Output: 20

The element 20 has neighbours 10 and 15,

both of them are less than 20.

Input: array[] = {10, 20, 15, 2, 23, 90, 67}

Output: 20 or 90

The element 20 has neighbours 10 and 15,

both of them are less than 20, similarly 90 has neighbous 23 and 67.

Following corner cases give better idea about the problem.

If input array is sorted in strictly increasing order,

the last element is always a peak element. For example, 50 is peak element in {10, 20, 30, 40, 50}.

If the input array is sorted in strictly decreasing order,

the first element is always a peak element. 100 is the peak element in {100, 80, 60, 50, 20}.

If all elements of input array are same, every element is a peak element.
 */
public class Main {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 20, 4, 1, 0 };
		int n = arr.length;

		System.out.print("Index of a peak point is " + findPeak(arr, n));
	}

	private static int findPeak(int[] arr, int n) {
		// First or last element is peak element
		if (n == 1)
			return arr[0];
		if (arr[0] >= arr[1])
			return 0;
		if (arr[n - 1] >= arr[n - 2])
			return n - 1;

		// Check for every other element
		for (int i = 1; i < n - 1; i++) {

			// Check if the neighbors are smaller
			if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1])
				return i;
		}
		return 0;
	}

}
