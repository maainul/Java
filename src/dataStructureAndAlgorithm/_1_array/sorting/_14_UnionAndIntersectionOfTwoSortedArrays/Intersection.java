package dataStructureAndAlgorithm._1_array.sorting._14_UnionAndIntersectionOfTwoSortedArrays;

import java.util.ArrayList;
import java.util.List;

public class Intersection {

	public static void main(String[] args) {
		int[] arr1 = new int[] { 1, 2, 3, 4, 5 };
		int[] arr2 = new int[] { 3, 2, 5, 9, 11 };
		getIntersection(arr1, arr2);

	}

	private static Object[] getIntersection(int[] arr1, int[] arr2) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					list.add(arr1[i]);
				}
			}
		}
		System.out.println(list);
		return list.toArray();
	}

}
