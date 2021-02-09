package dataStructureAndAlgorithm._1_array.searching._16_CheckIfAnArrayHasMajorityElement;

import java.util.*;

/*
Check if an array has a majority element
Last Updated: 30-08-2019
Given an array, the task is to find if the input array contains a majority element or not. An element is

Examples:

Input : arr[] = {2, 3, 9, 2, 2}
Output : Yes
A majority element 2 is present in arr[]

Input  : arr[] = {1, 8, 9, 2, 5}
Output : No
 */
public class Main {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 9, 2, 2 };
		System.out.println(majority(arr));
	}

	private static boolean majority(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}

		for (Map.Entry<Integer, Integer> x : map.entrySet()) {
			if (x.getValue() >= arr.length / 2) {
				return true;
			}
		}
		return false;

	}

}
