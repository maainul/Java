1.Sorting:
  - Bubble Sort
  - Insertion Sort
  - Selection Sort
  - Merge Sort
  - Quick Sort

2.Searching
  - Linear Search
  - Binary Search
3.wer
4.sdaf

# Bubble Sort

Difficulty Level : Easy

Last Updated : 30 Sep, 2020

Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.

Example:

First Pass:

( 5 1 4 2 8 ) –> ( 1 5 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1.

( 1 5 4 2 8 ) –>  ( 1 4 5 2 8 ), Swap since 5 > 4

( 1 4 5 2 8 ) –>  ( 1 4 2 5 8 ), Swap since 5 > 2

( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ), Now, since these elements are already in order (8 > 5), algorithm does not swap them.

Second Pass:

( 1 4 2 5 8 ) –> ( 1 4 2 5 8 )

( 1 4 2 5 8 ) –> ( 1 2 4 5 8 ), Swap since 4 > 2

( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )

( 1 2 4 5 8 ) –>  ( 1 2 4 5 8 )

Now, the array is already sorted, but our algorithm does not know if it is completed. The algorithm needs one whole pass without any swap to know it is sorted.

Third Pass:

( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )

( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )

( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )

( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )




![bubblesort](https://user-images.githubusercontent.com/37740006/109398276-1f149600-7966-11eb-8468-9238f21e716e.jpeg)

```java
package dataStructureAndAlgorithm.Sorting.BubbleSort;

public class _1_BubbleSort {

	public static void main(String[] args) {
		_1_BubbleSort obj = new _1_BubbleSort();
		int array[] = { 10, 7, 9, 2, 8, 3, 5, 4, 6, 1 };
		obj.printArray(array);
		obj.sort(array);
		System.out.println();
		obj.printArray(array);
	}

	private void sort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}

			}
		}

	}

	private void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
```
# Insertion Sort
## Algorithm  : Time Complexity O(n*n)
To sort an array of size n in ascending order: 
1. Iterate from arr[1] to arr[n] over the array. 
2. Compare the current element (key) to its predecessor. 
3. If the key element is smaller than its predecessor, compare it to the elements before. Move the greater elements one position up to make space for the swapped element.

![insertionsort](https://user-images.githubusercontent.com/37740006/109120676-73562500-7770-11eb-9f6e-a9222bd1eb11.png)
```java
package dataStructureAndAlgorithm.Sorting.InsertionSort;

public class _2_InsertionSort {

	public static void rotateDigit(String[] args) {
		_2_InsertionSort obj = new _2_InsertionSort();
		int array[] = { 10, 7, 9, 2, 8, 3, 5, 4, 6, 1 };
		obj.printArray(array);
		obj.sort(array);
		System.out.println();
		obj.printArray(array);
	}

	private void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int j = i;
			while (j > 0 && array[j - 1] > array[j]) {
				int temp = array[j];
				array[j] = array[j - 1];
				array[j - 1] = temp;
				j--;

			}
		}
	}

	private void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
```
# Selection Sort
1. Not Stable
2. In Place

## Time Complexity : O(n*n)

## Algoritm : 

1.we search for the lowest element and arrange it to the proper location. 

2.We swap the current element with the next lowest number.

![selection-sort (1)](https://user-images.githubusercontent.com/37740006/109400083-d44c4b80-7970-11eb-95d2-ff4526ef5772.png)

```java
// https://www.javatpoint.com/selection-sort-in-java
// https://www.geeksforgeeks.org/selection-sort/
// See video of geeks for geeks
/***************************************************************************
	Selection sort finds the maximum or the minimum value from the array and 
	exchanges it with the element at the end of the array.
	Then it finds the maximum value form the array except the last one and
	exchanges it with th second to the last element.
	
	// First Run:
	 * 5  4  3   2   1  // since 5 is the maximum value it exchanges with the last element 1
	// Second Run:
	 * 1  4  3   2|   5 // since 4 is the maximum value it exchanges with the last element 1
	// Third Run:
	 * 1  2  3|   4    5 :Sorting complete
 ****************************************************************************/
package dataStructureAndAlgorithm.Sorting.SelectionSort;

public class SelectionSortAlgorithm {

	public static void selectionSort(int[] arr) {
		// One by one move boundary of unsorted subarray
		for (int i = 0; i < arr.length - 1; i++) {
			// Find the minimum element in unsorted array
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {
					index = j;// searching for lowest index

				}

			}
			// Swap the found minimum element with the first
			// element
			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}

	}

	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

	public static void main(String[] args) {
		int array[] = { 5, 4, 3, 2, 1 };

		System.out.println("Before sort:");
		printArray(array);

		selectionSort(array);

		System.out.println("\n\nAfter Selection sort:");
		printArray(array);

	}
}
```
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
