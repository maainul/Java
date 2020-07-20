package dataStructureAndAlgorithm._1_array._1_arrayRotations;

import java.util.Arrays;

/*
Reversal algorithm for array rotation

Write a function rotate(arr[], d, n) that rotates arr[] of size n by d elements.

Example :

Input :  arr[] = [1, 2, 3, 4, 5, 6, 7]
         d = 2
Output : arr[] = [3, 4, 5, 6, 7, 1, 2] 

1. Divided into 2 part
	[1,2] and [3,4,5,6,7];

2. Reverse 1st part : [2,1,3,4,5,6,7]

3. Reverse 2nd part : [2,1,7,6,5,4,3];

4. Reverse All : [3,4,5,6,7,1,2];


 */
public class _2_ReversalAlgorithmForArrayRotation {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int d = 2;
		leftRotate(arr, d);
		System.out.println(Arrays.toString(arr));
	}

	private static void leftRotate(int[] arr, int d) {
		if (d == 0) {
			return;
		}
		int n = arr.length;

		reverseArray(arr, 0, d - 1);
		reverseArray(arr, d, n - 1);
		reverseArray(arr, 0, n - 1);

	}

	private static void reverseArray(int[] arr, int start, int end) {
		int temp;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}

}
