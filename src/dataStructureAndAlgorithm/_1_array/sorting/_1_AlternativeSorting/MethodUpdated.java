package dataStructureAndAlgorithm._1_array.sorting._1_AlternativeSorting;

import java.util.Arrays;

public class MethodUpdated {

	public static void main(String[] args) {
		int arr[] = { 1, 12, 4, 6, 7, 10 };
		int n = arr.length;
		alternateSort(arr, n);

	}

	private static void alternateSort(int[] arr, int n) {
		Arrays.sort(arr);
		
		int[] newArray = new int[arr.length];
		
		int i = 0, j = n -1;
		int index = 0;
		while(i < j) {
			newArray[index++] = arr[j--];
			newArray[index++] = arr[i++];
		}
		System.out.println(Arrays.toString(newArray));
		
	}

}
