package dataStructureAndAlgorithm._1_array._1_arrayRotations;

/*

METHOD 1 (Using temp array)

Input arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2, n =7
1) Store the first d elements in a temp array
   temp[] = [1, 2]
2) Shift rest of the arr[]
   arr[] = [3, 4, 5, 6, 7, 6, 7]
3) Store back the d elements
   arr[] = [3, 4, 5, 6, 7, 1, 2]

Time complexity : O(n)
Auxiliary Space : O(d)
 */
import java.util.Arrays;

public class _1_ProgramForArrayRotationMethod1 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int n = arr.length;
		int d = 2;
		rotateArray(arr, n, d);

	}

	private static void rotateArray(int[] arr, int n, int d) {
		int[] temp = new int[d];
		for (int i = 0; i < d; i++) {
			temp[i] = arr[i];
		}
		// temp array
		System.out.println(Arrays.toString(temp));
		int index = 0;
		for (int i = 2; i < arr.length; i++) {
			arr[index++] = arr[i];
		}
		// second array from d to last.
		System.out.println(Arrays.toString(arr));
		int tempInex = 0;
		for (int i = n - d; i < arr.length; i++) {
			arr[i] = temp[tempInex++];
		}
		// final array
		System.out.println(Arrays.toString(arr));
	}

}
