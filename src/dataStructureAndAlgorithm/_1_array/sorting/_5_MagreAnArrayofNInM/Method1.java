package dataStructureAndAlgorithm._1_array.sorting._5_MagreAnArrayofNInM;

import java.util.Arrays;

public class Method1 {

	public static void main(String[] args) {
		int[] mPlusN = { 2, 8, -1, -1, -1, 13, -1, 15, 20 };
		int[] N = { 5, 7, 9, 25 };
		int n = N.length;
		int m = mPlusN.length - n;

		mergeMandN(mPlusN, N, n, m);

	}

	private static void mergeMandN(int[] mPlusN, int[] N, int n2, int m) {
		int index = 0;
		for (int i = 0; i < mPlusN.length - 1; i++) {
			if (mPlusN[i] == -1) {
				mPlusN[i] = N[index++];
			}
		}
		Arrays.sort(mPlusN);
		System.out.println(Arrays.toString(mPlusN));

	}

}
