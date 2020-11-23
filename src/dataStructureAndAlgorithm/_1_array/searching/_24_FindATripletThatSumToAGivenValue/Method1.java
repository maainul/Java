package dataStructureAndAlgorithm._1_array.searching._24_FindATripletThatSumToAGivenValue;

/*
Find a triplet that sum to a given value

Given an array and a value, find if there is a triplet in array whose sum is equal to the given value. 

If there is such a triplet present in array, then print the triplet and return true. Else return false.

Example:

Input: array = {12, 3, 4, 1, 6, 9}, sum = 24;

Output: 12, 3, 9

Explanation: There is a triplet (12, 3 and 9) present

in the array whose sum is 24. 

Input: array = {1, 2, 3, 4, 5}, sum = 9

Output: 5, 3, 1

Explanation: There is a triplet (5, 3 and 1) present 

in the array whose sum is 9. 

*/

/*
Time Complexity: O(n3).

There are three nested loops traversing the array, so the time complexity is O(n^3)

Space Complexity: O(1).

As no extra space is required.
*/
public class Method1 {

	private static boolean find3Numbers(int[] a, int arr_size, int sum) {

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				for (int k = j + 1; k < a.length; k++) {
					if (a[i] + a[j] + a[k] == sum) {
						System.out.println("Triple sum is " + a[i] + " " + a[j] + " " + a[k]);
						return true;
					}
				}
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
