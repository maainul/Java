package interviewQuestions.countFrequencyOfArray;

/**
 * @Author Md. Mainul Hasan
 * 
 * 8:06:14 PM
 * 
 * Nov 12, 2020
 *
 */

import java.util.HashMap;

public class _3_CountFreqUsingHashMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 10, 20, 20, 10, 10, 20, 5, 20 };
		contFreq(arr, arr.length);

	}

	private static void contFreq(int[] arr, int length) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (map.get(arr[i]) != -1) {
				System.out.println(arr[i] + " --->" + map.get(arr[i]));
				map.put(arr[i], -1);
			}

		}

	}

}
