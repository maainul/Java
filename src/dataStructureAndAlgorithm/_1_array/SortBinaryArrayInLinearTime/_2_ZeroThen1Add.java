package dataStructureAndAlgorithm._1_array.SortBinaryArrayInLinearTime;

import java.util.Arrays;

public class _2_ZeroThen1Add {

	public static void main(String[] args) {
		int[] A = { 0, 0, 1, 0, 1, 1, 0, 1, 0, 0 };

		sort(A);

		// print the rearranged array
		System.out.println(Arrays.toString(A));

	}

	private static void sort(int[] a) {
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				a[index++] = 0;
			}
		}

		for (int i = index; i < a.length; i++) {
			a[index++] = 1;
		}

	}

}
