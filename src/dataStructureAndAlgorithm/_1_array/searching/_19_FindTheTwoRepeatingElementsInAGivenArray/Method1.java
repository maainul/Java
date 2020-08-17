package dataStructureAndAlgorithm._1_array.searching._19_FindTheTwoRepeatingElementsInAGivenArray;

import java.util.Arrays;

public class Method1 {

	public static void main(String[] args) {
		int arr[] = { 4, 2, 4, 5, 2, 3, 1 };
		int arr_size = arr.length;
		int[] ra = printRepeating(arr, arr_size);
		System.out.println(Arrays.toString(ra));
	}

	private static int[] printRepeating(int[] arr, int arr_size) {
		int result[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					result[i] = arr[i];
					System.out.print(arr[i] + " ");
				}
			}
		}
		return result;
	}

}
