package leetcode;

import java.util.Arrays;

public class _888_Candy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(2 / 2);
		int A[] = { 1, 2, 5 };
		int B[] = { 2, 4 };
		int[] result = fairCandySwap(A, B);
		System.out.println(Arrays.toString(result));
	}

	public static int[] fairCandySwap(int[] A, int[] B) {
		int Asum = 0;
		for (int i : A) {
			Asum += i;
		}
		int Bsum = 0;
		for (int i : B) {
			Bsum += i;
		}

		Arrays.sort(A);
		Arrays.sort(B);

		int temp = (Asum - Bsum) / 2;
		int[] ans = new int[2];
		int i = 0, j = 0;
		while (i < A.length && j < B.length) {
			if (A[i] - B[j] == temp) {
				ans[0] = A[i];
				ans[1] = B[j];
				break;
			} else if (A[i] - B[j] > temp) {
				j++;
			} else {
				i++;
			}
		}

		return ans;
	}

}
