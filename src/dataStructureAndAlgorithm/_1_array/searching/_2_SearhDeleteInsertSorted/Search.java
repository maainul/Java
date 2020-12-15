package dataStructureAndAlgorithm._1_array.searching._2_SearhDeleteInsertSorted;

public class Search {

	public static void main(String[] args) {
		int[] arr = { 10, 11, 12, 13, 14, 15 };
		int n = arr.length;
		int key = 14;
		int result = binarySearch(arr, 0, n, key);
		System.out.println(result);

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

}
