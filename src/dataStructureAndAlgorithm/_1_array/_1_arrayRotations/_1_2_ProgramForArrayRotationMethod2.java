package dataStructureAndAlgorithm._1_array._1_arrayRotations;

/*
METHOD 2 (Rotate one by one)


leftRotate(arr[], d, n)
start
  For i = 0 to i < d
    Left rotate all elements of arr[] by one
end

To rotate by one, store arr[0] in a temporary variable temp, 

move arr[1] to arr[0], arr[2] to arr[1] …and finally temp to arr[n-1]

Let us take the same example arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2
Rotate arr[] by one 2 times

We get  [2, 3, 4, 5, 6, 7, 1] after first rotation and

 		[ 3, 4, 5, 6, 7, 1, 2] after second rotation.
 		

Below is the implementation of the above approach :

Time complexity : O(n * d)
Auxiliary Space : O(1)

**/

import java.util.Arrays;

public class _1_2_ProgramForArrayRotationMethod2 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int n = arr.length;
		int d = 2;
		rotateArray(arr, n, d);
		System.out.println(Arrays.toString(arr));

	}

	private static void rotateArray(int[] arr, int n, int d) {
		for (int i = 0; i < d; i++) {
			rotateOneleftTORight(arr, n);
			
		}
	}

	private static void rotateOneleftTORight(int[] arr, int n) {

		int temp = arr[0];
		for (int i = 0; i < n - 1; i++) {
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;
			System.out.println(Arrays.toString(arr));
		}
		

	}
}