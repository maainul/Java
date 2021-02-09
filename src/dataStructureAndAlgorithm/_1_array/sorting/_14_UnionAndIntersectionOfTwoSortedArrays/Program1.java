package dataStructureAndAlgorithm._1_array.sorting._14_UnionAndIntersectionOfTwoSortedArrays;

import java.util.Arrays;

/*
Given two sorted arrays, find their union and intersection.

Example:

Input : arr1[] = {1, 3, 4, 5, 7}

        arr2[] = {2, 3, 5, 6} 

Output : Union : {1, 2, 3, 4, 5, 6, 7} 

         Intersection : {3, 5}

Input : arr1[] = {2, 5, 6}
  
        arr2[] = {4, 6, 8, 10} 

Output : Union : {2, 4, 5, 6, 8, 10} 

         Intersection : {6}

 */
public class Program1 {

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 4, 5, 6 };
		int arr2[] = { 2, 3, 5, 7 };
		int m = arr1.length;
		int n = arr2.length;
		printUnion(arr1, arr2, m, n);
	}

	private static void printUnion(int[] arr1, int[] arr2, int m, int n) {
		int[] newArray = new int[m + n];
		int i;
		for (i = 0; i < arr1.length; i++) {
			newArray[i] = arr1[i];
		}
		boolean found = false;
		for (int j = 0; j < arr2.length; j++) {
			newArray[i++] = arr2[j];
		}
		Arrays.sort(newArray);
		for (int j = 1; j < newArray.length; j++) {
			if (newArray[j - 1] == newArray[j]) {

			}
		}

		System.out.println(Arrays.toString(newArray));
	}

}
