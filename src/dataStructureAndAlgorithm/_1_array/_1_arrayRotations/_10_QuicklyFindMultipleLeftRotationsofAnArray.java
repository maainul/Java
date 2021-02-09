package dataStructureAndAlgorithm._1_array._1_arrayRotations;

/*
Input : arr[] = {1, 3, 5, 7, 9}
        k1 = 1
        k2 = 3
        k3 = 4
        k4 = 6
Output : 3 5 7 9 1
         7 9 1 3 5
         9 1 3 5 7
         3 5 7 9 1

Input : arr[] = {1, 3, 5, 7, 9}
        k1 = 14
Output : 9 1 3 5 7
 */
public class _10_QuicklyFindMultipleLeftRotationsofAnArray {
	public static void leftRotate(int arr[], int n, int k) {
		// Print array after
		// k rotations
		for (int i = k; i < k + n; i++)
			System.out.print(arr[i % n] + " ");
	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 7, 9 };
		int n = arr.length;

		int k = 2;
		leftRotate(arr, n, k);
		System.out.println();

	}

}
