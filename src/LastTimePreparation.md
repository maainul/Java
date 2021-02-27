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
