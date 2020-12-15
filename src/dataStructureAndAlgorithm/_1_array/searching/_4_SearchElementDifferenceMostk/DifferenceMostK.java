package dataStructureAndAlgorithm._1_array.searching._4_SearchElementDifferenceMostk;
/*
Searching in an array where adjacent differ by at most k
Last Updated: 04-09-2019

A step array is an array of integer where each element has a difference of at most k with its neighbor.

Given a key x, we need to find the index value of x if multiple element exist return the first occurrence of the key.

Examples:

Input : arr[] = {4, 5, 6, 7, 6}
           k = 1
           x = 6
Output : 2
The first index of 6 is 2.

Input : arr[] = {20, 40, 50, 70, 70, 60}
          k = 20
          x = 60
Output : 5
The index of 60 is 5
 */
public class DifferenceMostK {

	private static int search(int[] arr, int n, int x, int k) {
		// Traverse the given array starting
		// from leftmost element
		int i = 0;
		while (i < n) {

			// If x is found at index i
			if (arr[i] == x)
				return i;

			// Jump the difference between  
            // current array element and x 
            // divided by k We use max here 
            // to make sure that i moves  
            // at-least one step ahead. 
            i = i + Math.max(1, Math.abs(arr[i]  
                                    - x) / k); 

		}

		System.out.println("number is not" + " present!");

		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 8, 7, 6, 7, 6, 5, 4, 3, 2, 3, 4, 3 };
		int n = arr.length;
		int x = 3;
		int k = 6;
		System.out.println("Element " + x + " is present at index " + search(arr, n, k,3));

	}

}
