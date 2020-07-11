// https://www.programcreek.com/2012/11/quicksort-array-in-java/

package dataStructureAndAlgorithms.Sorting.QuickSort;

import java.util.Arrays;

public class QuickPivotMiddle {
	public static void main(String[] args) {
		int[] arr = { 9, 2, 4, 7, 3, 7, 10 };
		System.out.println("Before sorted array");
		System.out.println(Arrays.toString(arr));
		int high = arr.length - 1;
		quickSort(arr, 0, high);
		
		System.out.println("\nAfter sorted array");
		System.out.println(Arrays.toString(arr));
	}

	public static void quickSort(int[] arr, int low, int high) {
		if (low >= high)
			return;

		int middle = low + (high - low) / 2;
		int pivot = arr[middle];

		int index = partition(arr, low, high, pivot);

		quickSort(arr, low, index - 1);
		quickSort(arr, index, high);

	}

	public static int partition(int[] arr, int low, int high, int pivot) {
		// pick the pivot

		// make low < pivot and high > pivot
		// int i = low, j = high;
		while (low <= high) {
			while (arr[low] < pivot) {
				low++;
			}

			while (arr[high] > pivot) {
				high--;
			}

			if (low <= high) {
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				low++;
				high--;
			}
		}
		return low;
	}
}