package dataStructureAndAlgorithm._1_array.FindPairWithGivenSumInAnArray;

import java.util.HashMap;
import java.util.Map;

// arr = {8,7,2,5,3,1}
// sum = 10
// Time Complexity : O(n)

public class _3_HashMapSolution {

	public static void main(String[] args) {
		int[] arr = { 8, 7, 2, 5, 3, 1 };
		int sum = 10;
		sumArray(arr, sum);

	}

	private static void sumArray(int[] arr, int sum) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], i);
		}

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(sum - arr[i])) {
				System.out.println(i + " " + map.get(sum - arr[i]));
				return;
			}
		}
	}

}
