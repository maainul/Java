package dataStructureAndAlgorithm._1_array.searching;

import java.util.HashMap;

public class _8_FindTheElementThatAppearsOnce {

	public static void main(String[] args) {
		int ar[] = { 2, 3, 5, 4, 5, 3, 4 };
		int n = ar.length;
		System.out.println("Element occurring once is " + findSingle(ar, n) + " ");

	}

	private static int findSingle(int[] ar, int n) {
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();

		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < ar.length; i++) {
			if (!m.containsKey(ar[i])) {
				sum1 += ar[i];
				m.put(ar[i], 1);
			}

			sum2 += ar[i];
		}

		return (int) (2 * (sum1) - (sum2));
	}

}
