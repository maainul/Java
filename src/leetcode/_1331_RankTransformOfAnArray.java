package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 Given an array of integers arr, replace each element with its rank.

The rank represents how large the element is. The rank has the following rules:

    1. Rank is an integer starting from 1.
    2. The larger the element, the larger the rank. If two elements are equal, their rank must be the same.
    3. Rank should be as small as possible.

 

Example 1:

Input: arr = [40,10,20,30]
Output: [4,1,2,3]
Explanation: 40 is the largest element. 10 is the smallest. 20 is the second smallest. 30 is the third smallest.

Example 2:

Input: arr = [100,100,100]
Output: [1,1,1]
Explanation: Same elements share the same rank.

Example 3:

Input: arr = [37,12,28,9,100,56,80,5,12]
Output: [5,3,4,2,8,6,7,1,3]

 

Constraints:

    0 <= arr.length <= 105
    -109 <= arr[i] <= 109

 */
public class _1331_RankTransformOfAnArray {

	public static void main(String[] args) {
		int[] arr = { 40, 10, 20, 30 };

		System.out.println(Arrays.toString(arr));

		int[] result = rankArray(arr);

		System.out.println(Arrays.toString(result));

		int[] arr2 = { 40, 10, 20, 30 };

		System.out.println(Arrays.toString(arr2));

		int[] result2 = arrayRankTransform(arr2);

		System.out.println(Arrays.toString(result2));
	}

	// Brute force approach.
	private static int[] rankArray(int[] arr) {
		int[] newArray = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					count++;
				}
			}
			newArray[i] = count;
		}
		return newArray;
	}

	public static int[] arrayRankTransform(int[] arr) {
		int[] cpy = Arrays.copyOf(arr, arr.length);
		Arrays.sort(cpy);
		Map<Integer, Integer> map = new HashMap<>();
		int dupes = 0;
		for (int i = 0; i < cpy.length; i++) {
			if (map.containsKey(cpy[i])) {
				dupes++;
			} else {
				map.put(cpy[i], i + 1 - dupes);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = map.get(arr[i]);
		}
		return arr;
	}
}
