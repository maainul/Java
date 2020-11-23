package dataStructureAndAlgorithm._1_array.searching._24_FindATripletThatSumToAGivenValue;
/*
Approach: 

This approach uses extra space but is more simpler than the two pointers approach. 

Run two loops outer loop from start to end and inner loop from i+1 to end. 

Create a hashmap or set to store the elements in between i+1 to j-1. 

So if the given sum is x, check if there is a number in the set which is equal to x – arr[i] – arr[j]. 

If yes print the triplet.

Algorithm:

Traverse the array from start to end. (loop counter i)

Create a HashMap or set to store unique pairs.

Run another loop from i+1 to end of the array. (loop counter j)

If there is an element in the set which is equal to x- arr[i] – arr[j], then print the triplet (arr[i], arr[j], x-arr[i]-arr[j]) and break

Insert the jth element in the set. 
  
 */

import java.util.HashSet;

public class HashingBasedSolution {

	private static boolean find3Numbers(int[] A, int arr_size, int sum) {

		for (int i = 0; i < A.length; i++) {
			HashSet<Integer> s = new HashSet<Integer>();
			int curr_sum = sum - A[i];
			for (int j = i + 1; j < A.length; j++) {
				if (s.contains(curr_sum - A[j])) {
					System.out.printf("Triplet is %d, %d, %d", A[i], A[j], curr_sum - A[j]);
					return true;
				}
				s.add(A[j]);
			}
		}
		return false;
	}

	public static void main(String[] args) {

		int A[] = { 1, 4, 45, 6, 10, 8 };
		int sum = 22;
		int arr_size = A.length;

		find3Numbers(A, arr_size, sum);
	}

}
