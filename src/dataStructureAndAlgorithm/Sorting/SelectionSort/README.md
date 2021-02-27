# Selection Sort
## Algoritm : 

1.we search for the lowest element and arrange it to the proper location. 

2.We swap the current element with the next lowest number.

![selection-sort](https://user-images.githubusercontent.com/37740006/109399412-ecba6700-796c-11eb-8154-8b982a734d64.png)

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
