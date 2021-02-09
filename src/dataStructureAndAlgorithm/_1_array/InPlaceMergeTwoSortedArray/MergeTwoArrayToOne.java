package dataStructureAndAlgorithm._1_array.InPlaceMergeTwoSortedArray;

import java.util.Arrays;

public class MergeTwoArrayToOne {

	public static void main(String[] args) {
		int[] X = { 1, 4, 7, 8, 10 };
		int[] Y = { 2, 3, 9 };

		merge(X, Y);

		System.out.println("X: " + Arrays.toString(X));
		System.out.println("Y: " + Arrays.toString(Y));

	}

	private static void merge(int[] x, int[] y) {
		int[] newArray = new int[(x.length) + (y.length)];

		int index = 0;
		for (int j = 0; j < newArray.length; j++) {
			if (x[j] < y[j]) {
				newArray[index++] = x[j];
			}

		}

	}

}
