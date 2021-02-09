package dataStructureAndAlgorithm._1_array.searching._7_FindTheOnlyRepetitiveElement;

import java.util.*;

public class FindRepetitiveUsingHashMap {

	public static void main(String[] args) {
		int[] arr = { 9, 7, 1, 3, 2, 6, 1, 8, 5, 3, 4, 7 };
		int n = arr.length;
		System.out.println(findRepeatingUsingSet(arr, n));

		findRepeatingUsingMap(arr, n);

		findUsingHashMap2(arr);

	}

	private static int findRepeatingUsingSet(int[] arr, int n) {
		HashSet<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (s.contains(arr[i])) {
				return arr[i];

			}
			s.add(arr[i]);
		}
		return -1;
	}

	private static void findRepeatingUsingMap(int[] arr, int n) {
		// Creates an empty HashMap
		HashMap<Integer, Integer> hmap = new HashMap<>();

		// Traverse through the given array
		for (int i = 0; i < arr.length; i++) {
			Integer c = hmap.get(arr[i]);

			// If this is first occurrence of element
			if (hmap.get(arr[i]) == null)
				hmap.put(arr[i], 1);

			// If elements already exists in hash map
			else
				hmap.put(arr[i], ++c);
		}

		// Print result
		for (Map.Entry m : hmap.entrySet())
			System.out.println("Frequency of " + m.getKey() + " is " + m.getValue());

	}

	private static void findUsingHashMap2(int[] arr) {

		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {

			if (hashMap.containsKey(arr[i])) {
				System.out.println("Duplicate" + arr[i]);
				hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
			} else {
				hashMap.put(arr[i], 1);
			}
		}
		System.out.println(hashMap);
	}

}
