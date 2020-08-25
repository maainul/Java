package dataStructureAndAlgorithm._1_array.sorting._12_ShortestUnorderedSubarray;

import java.util.Arrays;

/*
An array is given of n length, 

and problem is that we have to find the length of shortest unordered {neither increasing nor decreasing} 

sub array in given array.

Examples:

Input : n = 5
        7 9 10 8 11
        
Output : 3

Explanation : 9 10 8 unordered sub array.

Input : n = 5

       1 2 3 4 5

Output : 0
 
Explanation :  Array is in increasing order.

 */
public class Problem1 {

	public static void main(String[] args) {
		int ar[] = new int[] { 7, 9, 10, 8, 11 };
		int n = ar.length;

		System.out.println(shortestUnsorted(ar, n));

	}

	private static int shortestUnsorted(int[] ar, int n) {
		int[] newArray = ar.clone();

		Arrays.sort(ar);
		int start = ar.length;
		int end = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != newArray[i]) {
				start = Math.min(start, i);
				end = Math.max(end, i);
			}
		}

		return (end - start) > 0 ? (end - start + 1) : 0;

	}

}
