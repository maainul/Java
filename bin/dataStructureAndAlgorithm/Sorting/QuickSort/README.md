# QUICK SORT
There are many different versions of quickSort that pick pivot in different ways.

1. Always pick first element as pivot.
2. Always pick last element as pivot 
3. Pick a random element as pivot.
4. Pick median as pivot.(implemented below)

## Time Complexities

**Worst Case Complexity [Big-O]: O(n2)**

It occurs when the pivot element picked is either the greatest or the smallest element.

This condition leads to the case in which the pivot element lies in an extreme end of the sorted array. 

One sub-array is always empty and another sub-array contains n - 1 elements. Thus, quicksort is called only on this sub-array.

However, the quick sort algorithm has better performance for scattered pivots.

**Best Case Complexity [Big-omega]: O(n*log n)**

It occurs when the pivot element is always the middle element or near to the middle element.

**Average Case Complexity [Big-theta]: O(n*log n)**

It occurs when the above conditions do not occur.

## Pick median as pivot / Middle as Pivot


![011019_1052_QuickSortAl2](https://user-images.githubusercontent.com/37740006/109401823-25613d00-797b-11eb-854b-265646be943d.png)



```java
package dataStructureAndAlgorithm.Sorting.QuickSort;

import java.util.Arrays;

public class _5_QuickSort {

	public static void main(String[] args) {
		int array[] = { 9, 6, 7, 4, 1, 3, 2 };
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

		int index = partition(array, low, high, pivot);
		quickSort(array, low, index - 1);
		quickSort(array, index, high);

	}

	private static int partition(int[] array, int low, int high, int pivot) {
		while (low <= high) {
			while (array[low] < pivot) {
				low++;
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
```
