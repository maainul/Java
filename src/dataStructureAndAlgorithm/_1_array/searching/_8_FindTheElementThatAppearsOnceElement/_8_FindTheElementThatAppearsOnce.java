package dataStructureAndAlgorithm._1_array.searching._8_FindTheElementThatAppearsOnceElement;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class _8_FindTheElementThatAppearsOnce {

	public static void main(String[] args) {
		int ar[] = { 2, 3, 5, 4, 5, 3, 4,1 };
		int n = ar.length;
		System.out.println("Element occurring once is " + findSingle(ar, n) + " ");

	}

	private static int findSingle(int[] arr, int n) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (set.contains(arr[i])) {
				set.remove(arr[i]);
			}else {
				set.add(arr[i]);
			}
		}

		System.out.println(set);
		return set.size();
	}

}
