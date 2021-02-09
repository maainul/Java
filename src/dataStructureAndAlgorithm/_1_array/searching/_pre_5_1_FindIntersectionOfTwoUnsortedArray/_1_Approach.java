package dataStructureAndAlgorithm._1_array.searching._pre_5_1_FindIntersectionOfTwoUnsortedArray;

import java.util.Arrays;

public class _1_Approach {
	public static void main(String[] args) {

		int arr1[] = { 7, 1, 5, 2, 3, 6 };

		int arr2[] = { 3, 8, 6, 20, 7 };

		unionOfTwo(arr1, arr2);
		System.out.println();
		unionIntersection(arr1, arr2);
	}

	private static void unionOfTwo(int[] arr1, int[] arr2) {

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		int i = 0;
		int j = 0;
		int m = arr1.length;
		int n = arr2.length;
		while (i < m && j < n) {
			if (arr1[i] < arr2[j]) {
				System.out.println(arr1[i]);
				i++;

			} else if (arr1[i] > arr2[j]) {
				System.out.println(arr2[j]);
				j++;
			} else {
				System.out.println(arr1[i]);
				i++;
				j++;
			}
		}

	}

	private static void unionIntersection(int[] arr1, int[] arr2) {

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		int i = 0;
		int j = 0;
		int m = arr1.length;
		int n = arr2.length;
		while (i < m && j < n) {
			if (arr1[i] < arr2[j]) {
				i++;

			} else if (arr1[i] > arr2[j]) {
				j++;
			} else {
				System.out.println(arr1[i]);
				i++;
				j++;
			}
		}

	}
}