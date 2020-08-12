package dataStructureAndAlgorithm._1_array._4_searching;

public class _1_SearchInsertAndDeleteInAnUnsortedArray {

	public static void main(String[] args) {
		int[] arr = { 12, 54, 10, 5, 36, 90 };
		// search
		int result = searchElement(arr, 5);
		if (result == -1) {
			System.out.println("Not found");

		} else {
			System.out.println("Data found in index " + result);
		}
		// insert
		int n = arr.length;
		int capacity = 20;
		int key = 100;
		int m = insertData(arr, n, capacity, key);
		for (int i = 0; i < m; i++) {
			System.out.println(arr[i]);
		}

	}

	private static int insertData(int[] arr, int n, int capacity, int key) {
		if (n >= capacity) {
			return n;
		}
		arr[n] = key;
		return (n + 1);
	}

	private static int searchElement(int[] arr, int i) {
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == i) {
				return j;
			}
		}
		return -1;

	}

}
