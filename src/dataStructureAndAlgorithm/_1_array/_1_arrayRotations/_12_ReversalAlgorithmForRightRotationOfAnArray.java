package dataStructureAndAlgorithm._1_array._1_arrayRotations;

public class _12_ReversalAlgorithmForRightRotationOfAnArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int n = arr.length;
		int k = 3;

		rightRotate(arr, k, n);
		printArray(arr, n);

	}

	private static void rightRotate(int[] arr, int d, int n) {
		reverseArray(arr, 0, n - 1);
		reverseArray(arr, 0, d - 1);
		reverseArray(arr, d, n - 1);

	}

	private static void reverseArray(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}

	private static void printArray(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
