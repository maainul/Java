package dataStructureAndAlgorithm._1_array._1_arrayRotations;

/*
 * first take a temp array and store value from d to n
 * 	[3,4,5,6,7]
 * 	
 * then copy first two element
 * 
 * [3,4,5,6,7,1,2]
 * 
 *
 */
import java.util.Arrays;

public class _1_3_RotateArray {

	private static void rotateArray(int[] arr, int n, int d) {
		int index = 0;
		int[] temparray = new int[n];
		for (int i = d; i < arr.length; i++) {
			temparray[index++] = arr[i];
		}
		int j = 0;
		for (int i = n - d; i < n; i++) {
			temparray[i] = arr[j++];
		}
		System.out.println(Arrays.toString(temparray));
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int n = arr.length;
		int d = 2;
		rotateArray(arr, n, d);

	}

}
