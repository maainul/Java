package dataStructureAndAlgorithm._1_array._1_arrayRotations;

/*

Find the minimum element in a sorted and rotated array

A sorted array is rotated at some unknown point, find the minimum element in it.

Following solution assumes that all elements are distinct.

Examples:

Input: {5, 6, 1, 2, 3, 4}
Output: 1

Input: {1, 2, 3, 4}
Output: 1

Input: {2, 1}
Output: 1
 */
public class _11_FindTheMinimumElementInaSortedAndRotatedArray {

	public static void main(String[] args) {
		int[] arr = { 5, 6, 7, 8, 9, 10, 1, 2, 3, 4 };
		int low = 0;
		int high = arr.length;
		int result = findPivot(arr, low, high);
		System.out.println(result);
	}

	private static int findPivot(int[] arr, int low, int high) {

		if (high < low) {
			return -1;
		}

		if (high == low) {
			return arr[low];
		}

		int mid = (high + low) / 2;

		if (mid < high && arr[mid] > arr[mid + 1]) {
			return arr[mid + 1];
		}

		if (mid > low && arr[mid] < arr[mid - 1]) {
			return arr[mid - 1];
		}

		if (arr[low] >= arr[mid]) {
			return findPivot(arr, low, mid - 1);
		}
		return findPivot(arr, mid + 1, high);

	}

}
