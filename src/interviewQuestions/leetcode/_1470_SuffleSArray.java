package interviewQuestions.leetcode;

import java.util.Arrays;

public class _1470_SuffleSArray {

	public static void main(String[] args) {
		int[] array = { 2, 5, 4, 1, 3, 7 };
		int n = 3;
		int[] result = suffle(array, n);
		System.out.println(Arrays.toString(result));

		int[] res = suffleMethod2(array, n);
		System.out.println(Arrays.toString(res));

	}

	// bitwise operator

	private static int[] suffleMethod2(int[] array, int n) {
		int[] newArray = new int[2 * n];
		for (int i = 0; i < newArray.length; i++) {
			if ((i & 1) == 1) {
				newArray[i] = array[n + i / 2];
			} else {
				newArray[i] = array[i / 2];

			}
		}
		return newArray;
	}

	private static int[] suffleMethod3(int[] array, int n) {
		int[] newArray = new int[2 * n];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = (i & 1) == 1 ? array[n + i / 2] : array[i / 2];
		}
		return newArray;

	}

	private static int[] suffle(int[] array, int n) {
		int[] a = new int[array.length];
		int index = 0;
		int p1 = 0;
		int p2 = n;
		for (int i = 0; i < n; i++) {
			a[index++] = array[p1++];
			a[index++] = array[p2++];
		}
		return a;

	}

}
