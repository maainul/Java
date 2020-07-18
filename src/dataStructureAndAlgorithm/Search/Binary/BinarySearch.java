package dataStructureAndAlgorithm.Search.Binary;
//Java implementation of iterative Binary Search 
public class BinarySearch {

	// Driver method to test above
	public static void main(String args[]) {

		int arr[] = { 2, 3, 45, 10, 20, 25, 40 };

		int x = 0;

		int result = binarySearch(arr, x);
		if (result != 0)
			System.out.println("Element found at " + "index " + result);

		else
			System.out.println("Element not present");
	}

	// Returns index of x if it is present in arr[],
	// else return 0
	private static int binarySearch(int arr[], int x) {
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int middle = left + (right - left) / 2;

			// Check if x is present at mid
			if (arr[middle] == x)
				return middle;
			// If x greater, ignore left half
			else if (arr[middle] < x)
				left = middle + 1;

			// If x is smaller, ignore right half
			else
				right = middle - 1;
		}
		// if we reach here, then element was
		// not present
		return 0;
	}

}