package dataStructureAndAlgorithm._1_array._1_arrayRotations._1_4_JugglingArray;

import java.util.Arrays;

public class _1_4_RotateArrayJugglingAlgoithm {

	private static void rotateleft(int[] arr, int n, int d) {
		int j;
		for (int i = 0; i < gcd(n, d); i++) {
			int temp = arr[i];
			j = i;

			while (true) {
				int k = (j + d) % n;

				if (k >= n) {
					k = k - n;
				}
				if (k == i) {
					break;
				}
				arr[j] = arr[k];
				j = k;
			}

			arr[j] = temp;
		}

	}

	private static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int n = arr.length;
		int d = 2;

		rotateleft(arr, n, d);
		System.out.println(Arrays.toString(arr));

	}

}
