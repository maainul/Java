package array;

import java.util.Arrays;

public class FoEachLoop {

	public static void main(String[] args) {

		int[] A = { 1, 2, 3, 4 };
		int[][] queries = { { 1, 0 }, { -3, 1 }, { -4, 0 }, { 2, 3 } };
		int[] res = sumEvenAfterQueries(A, queries);

		System.out.println(Arrays.toString(res));
	}

	public static int[] sumEvenAfterQueries(int[] A, int[][] queries) {
		int[] result = new int[queries.length];

		int index = 0;
		for (int[] value : queries) {
			// add value of 1 and A index of value
			int add = value[0] + A[value[1]];
			// update the value of A with value[1] index number
			A[value[1]] = add;
			// calculate even
			int sum = 0;
			for (int i = 0; i < A.length; i++) {
				if (A[i] % 2 == 0) {
					sum += A[i];
				}
			}
			// store result to new array.
			result[index] = sum;
			index++;
		}
		return result;

	}

}
