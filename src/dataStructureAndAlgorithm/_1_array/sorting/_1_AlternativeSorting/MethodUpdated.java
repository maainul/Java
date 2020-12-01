package dataStructureAndAlgorithm._1_array.sorting._1_AlternativeSorting;

import java.util.Arrays;

/*
Given an array of integers,

print the array in such a way that the first element is first maximum

and second element is first minimum and so on.

Examples :

Input : arr[] = {7, 1, 2, 3, 4, 5, 6}
Output : 7 1 6 2 5 3 4

Input : arr[] = {1, 6, 9, 4, 3, 7, 8, 2}
Output : 9 1 8 2 7 3 6 4

 */
public class MethodUpdated {

	public static void main(String[] args) {
		int arr[] = { 1, 12, 4, 6, 7, 10 };
		int n = arr.length;
		alternateSort(arr, n);

	}

	private static void alternateSort(int[] arr, int n) {
		Arrays.sort(arr);
		
		int[] newArray = new int[arr.length];
		
		int i = 0, j = n -1;
		int index = 0;
		while(i < j) {
			newArray[index++] = arr[j--];
			newArray[index++] = arr[i++];
		}
		System.out.println(Arrays.toString(newArray));
		
	}

}
