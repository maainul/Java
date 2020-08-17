package dataStructureAndAlgorithm._1_array.searching._7_FindTheOnlyRepetitiveElement;

import java.util.HashSet;

public class FindRepetitiveUsingHashMap {

	public static void main(String[] args) {
		int[] arr = { 9, 7, 2, 6, 1, 8, 5, 3, 4, 7 };
		int n = arr.length;
		System.out.println(findRepeating(arr, n));

	}

	private static int findRepeating(int[] arr, int n) {
		HashSet<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (s.contains(arr[i])) {
				return arr[i];

			}
			s.add(arr[i]);
		}
		return -1;
	}

}
