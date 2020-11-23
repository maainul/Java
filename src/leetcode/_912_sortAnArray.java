package leetcode;

import java.util.Arrays;

public class _912_sortAnArray {

	public static void main(String[] args) {
		int[] array = {5,2,3,1};
		int[] re = sortArray(array);
		System.out.println(Arrays.toString(re));
	}

	private static int[] sortArray(int[] array) {
		
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length-1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		return array;
	}
}
