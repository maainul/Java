package dataStructureAndAlgorithm._1_array.searching._6_FindPositionOfAnElementInaSortedArrayOfInfiniteNumbers;
/*
Find position of an element in a sorted array of infinite numbers

Suppose you have a sorted array of infinite numbers, how would you search an element in the array?

Source: Amazon Interview Experience.
Since array is sorted, the first thing clicks into mind is binary search, but the problem 
here is that we don’t know size of array.
If the array is infinite, that means we don’t have proper bounds to apply binary search. 
So in order to find position of key, first we find bounds and then apply binary search algorithm.

Let low be pointing to 1st element and high pointing to 2nd element of array, 
Now compare key with high index element,

->if it is greater than high index element then copy high index in low index 

and double the high index.

->if it is smaller, then apply binary search on high and low indices found.
 */
public class _6_FindPositionOfASortedArrayInfiniteNumbers {

	// Method takes an infinite size array and a key to be
	// searched and returns its position if found else -1.
	// We don't know size of arr[] and we can assume size to be
	// infinite in this function.
	// NOTE THAT THIS FUNCTION ASSUMES arr[] TO BE OF INFINITE SIZE
	// THEREFORE, THERE IS NO INDEX OUT OF BOUND CHECKING
	private static int findPos(int[] arr, int key) {
		int l = 0;
		int h = 1;
		int val = arr[0];
		while (val < key) {
			l = h;
			// store previous high
			// check that 2*h doesn't exceeds array
			// length to prevent ArrayOutOfBoundException
			if (2 * h < arr.length - 1) {
				h = 2 * h;
			} else {
				h = arr.length - 1;
			}
			val = arr[h];
		}
		return binarySearch(arr, l, h, key);
	}

	private static int binarySearch(int[] arr, int low, int high, int key) {

		if (high < low) {
			return -1;
		}

		int mid = (low + high) / 2;

		if (arr[mid] == key) {
			return mid;
		}

		if (arr[mid] < key) {
			return binarySearch(arr, (mid + 1), high, key);
		}

		return binarySearch(arr, low, (mid - 1), key);
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };
		int ans = findPos(arr, 10);

		if (ans == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element found at index " + ans);
	}

}
