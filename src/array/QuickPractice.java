package array;

import java.util.Arrays;

public class QuickPractice {

	public static void main(String[] args) {
		int array[] = { 9, 3, 22, 7, 6, 4 };
		int hight = array.length - 1;
		System.out.println("\nBefore Sorted");
		System.out.println(Arrays.toString(array));

		quickSort(array, 0, hight);

		System.out.println("\nAfter sorted ");
		System.out.println(Arrays.toString(array));

	}

	private static void quickSort(int[] array, int low, int hight) {
		if (low >= hight) {
			return;
		}

		int middle = low + (hight - low) / 2;
		int pivot = array[middle];

		int index = partition(array, low, hight, pivot);
		quickSort(array, low, index - 1);
		quickSort(array, index, hight);

	}

	private static int partition(int[] array, int low, int hight, int pivot) {
		while (low <= hight) {
			while (array[low] < pivot) {
				low++;
			}
			while (array[hight] > pivot) {
				hight--;
			}

			if (low < hight) {
				int temp = array[low];
				array[low] = array[hight];
				array[hight] = temp;
				low++;
				hight--;
			}
		}
		return low;
	}

}
