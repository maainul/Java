package dataStructureAndAlgorithms.Search.Binary;

//Java implementation of iterative Binary Search 
public class BinarySearchRecursive {

	// Driver method to test above
	public static void main(String args[]) {

		int arr[] = { 2, 3, 45, 10, 20, 25, 40 };

		int x = 40;
		int left = 0;
		int right = arr.length - 1;
		int result = binarySearch(arr, left,right,x);
		if (result != 0)
			System.out.println("Element found at " + "index " + result);

		else
			System.out.println("Element not present");
	}

	// Returns index of x if it is present in arr[],
	// else return 0
	private static int binarySearch(int arr[], int left, int right, int x) {
		if(left > right) {
			return 0;
		}

		while (left <= right) {
			int middle = left + (right - left) / 2;

			// Check if x is present at mid
			if (arr[middle] == x)
				return middle;
			// If x greater, ignore left half
			else if (arr[middle] < x)
				return binarySearch(arr,middle + 1,right,x);

			// If x is smaller, ignore right half
			else
				right = middle - 1;
			return binarySearch(arr,left,middle-1,x);
		}
		// if we reach here, then element was
		// not present
		return 0;
	}

}