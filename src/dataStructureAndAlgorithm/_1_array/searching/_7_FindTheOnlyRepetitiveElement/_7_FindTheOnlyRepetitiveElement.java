package dataStructureAndAlgorithm._1_array.searching._7_FindTheOnlyRepetitiveElement;

/*
Find the only repetitive element between 1 to n-1

Last Updated: 25-04-2019

We are given an array arr[] of size n.

Numbers are from 1 to (n-1) in random order.

The array has only one repetitive element. We need to find the repetitive element.

Examples :

Input  : a[] = {1, 3, 2, 3, 4}
Output : 3

Input  : a[] = {1, 5, 1, 2, 3, 4}
Output : 1
 */
public class _7_FindTheOnlyRepetitiveElement {

	public static void main(String[] args) {
		int[] arr = { 9, 8, 2, 6, 1, 8, 5, 3, 4, 7 };
		int n = arr.length;
		System.out.println(findRepeating(arr, n));
	}

	private static int findRepeating(int[] arr, int n) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum - (((n - 1) * n) / 2);
	}
}
