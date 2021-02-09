package dataStructureAndAlgorithm._1_array.SortBinaryArrayInLinearTime;

import java.util.Arrays;

public class _1_Count0AndAdd1 {

	public static void main(String[] args) {
		int[] A = { 0, 0, 1, 0, 1, 1, 0, 1, 0, 0 };

		sort(A);

		// print the rearranged array
		System.out.println(Arrays.toString(A));

	}

	private static void sort(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				count++;
			}
		}

		for (int i = 0; i < count; i++) {
			a[i] = 0;
		}
		for (int i = count; i < a.length; i++) {
			a[i] = 1;
		}

	}

}
