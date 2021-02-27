package dataStructureAndAlgorithm.Sorting.QuickSort;

import java.util.Arrays;

public class _5_QuickSort {

	public static void main(String[] args) {
		int array[] = {9,7,4,10,21,5};
		System.out.println("Before Sorted Array...");
		System.out.println(Arrays.toString(array));
		int high = array.length - 1;
		quickSort(array, 0, high);

		System.out.println("\nAfter Sorted");
		System.out.println(Arrays.toString(array));
	}

	private static void quickSort(int[] array, int low, int high) {
		if (low >= high) {
			return;
		}
		int middle = low + (high - low) / 2;
		int pivot = array[middle];
		System.out.println("Pivot" + pivot);

		int index = partition(array, low, high, pivot);
		System.out.println("Index "+index);
		quickSort(array, low, index - 1);
		quickSort(array, index, high);

	}

	private static int partition(int[] array, int low, int high, int pivot) {
		while (low <= high) {
			while (array[low] < pivot) {
				low++;
				System.out.println("low : "+ array[low]);
			}
			while (array[high] > pivot) {
				high--;
			}

			if (low <= high) {
				int temp = array[low];
				array[low] = array[high];
				array[high] = temp;
				low++;
				high--;
			}
		}
		return low;
	}

}
