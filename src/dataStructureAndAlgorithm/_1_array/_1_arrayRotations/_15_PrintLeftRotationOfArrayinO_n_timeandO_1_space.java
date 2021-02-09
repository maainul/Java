package dataStructureAndAlgorithm._1_array._1_arrayRotations;

/*

Print left rotation of array in O(n) time and O(1) space

Given an array of size n and multiple values around which we need to left rotate the array. How to quickly print multiple left rotations?

Examples :

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
public class _15_PrintLeftRotationOfArrayinO_n_timeandO_1_space {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 7, 9 };
		int n = arr.length;

		int k = 2;
		leftRotate(arr, n, k);

		k = 3;
		leftRotate(arr, n, k);

		k = 4;
		leftRotate(arr, n, k);

	}

	private static void leftRotate(int[] arr, int n, int k) {
		int mod = k % n;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[(i + mod) % n] + " ");
		}
		System.out.println();

	}

}
