package dataStructureAndAlgorithm._1_array.searching._pre_5_1_FindIntersectionOfTwoUnsortedArray;

import java.util.HashSet;
import java.util.TreeSet;

/*
Find Union and Intersection of two unsorted arrays
Last Updated: 12-10-2020

Given two unsorted arrays that represent two sets (elements in every array are distinct), find union and intersection of two arrays.

For example, if the input arrays are:

arr1[] = {7, 1, 5, 2, 3, 6}

arr2[] = {3, 8, 6, 20, 7}

Then your program should print Union as {1, 2, 3, 5, 6, 7, 8, 20} and Intersection as {3, 6, 7}.

Note that the elements of union and intersection can be printed in any order.
 */
public class Main {
	public static void main(String[] args) {

		int arr1[] = { 7, 1, 5, 2, 3, 6 };

		int arr2[] = { 3, 8, 6, 20, 7 };

		unionOfTwo(arr1, arr2);
		unionIntersectionHashSet(arr1, arr2);
	}

	private static void unionIntersectionHashSet(int[] arr1, int[] arr2) {
		HashSet hashSet1 = new HashSet();
		HashSet hashSet2 = new HashSet();
		for (Integer i : arr1) {
			hashSet1.add(i);
		}

		for (Integer i : arr2) {
			if (hashSet1.contains(i)) {
				hashSet2.add(i);
			}
			hashSet1.add(i);
		}
		System.out.println(hashSet1);
		System.out.println(hashSet2);

	}

	private static void unionOfTwo(int[] arr1, int[] arr2) {
		TreeSet treeSet = new TreeSet();
		int i = 0;
		for (i = 0; i < arr1.length; i++) {
			treeSet.add(arr1[i]);
		}
		// Union and Intersection
		TreeSet treeSet2 = new TreeSet();
		for (int j = 0; j < arr2.length; j++) {
			if (treeSet.contains(arr2[j])) {
				treeSet2.add(arr2[j]);
			}
			treeSet.add(arr2[j]);
		}
		System.out.println(treeSet);
		System.out.println(treeSet2);
	}
}
