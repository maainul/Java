package dataStructureAndAlgorithm._1_array.FindMaximunLengthSubArrayHavingGivenSum;

import java.util.HashMap;
import java.util.Map;

public class _2_HashMap {

	public static void main(String[] args) {
		int[] A = { 5, 6, -5, 5, 3, 5, 3, -2, 0 };
		int sum = 8;

		maxLengthSubArray(A, sum);

	}

	private static void maxLengthSubArray(int[] a, int S) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, -1);
		int sum = 0;

		int len = 0;

		int ending_index = -1;

		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			map.putIfAbsent(sum, i);
			if (map.containsKey(sum - S) && len < i - map.get(sum - S)) {
				len = i - map.get(sum - S);
				ending_index = i;
			}
		}

		System.out.println("[" + (ending_index - len + 1) + "," + ending_index + "]");

	}

}
