/**
 * @Author Md. Mainul Hasan
 * 
 * 8:06:14 PM
 * 
 * Nov 12, 2020
 *
 */
package leetcode.countFrequencyOfArray;

import java.util.HashMap;
import java.util.Map;

public class _2_CountFreqUsingHash {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 10, 20, 20, 10, 10, 20, 5, 20 };
		contFreq(arr, arr.length);

	}

	private static void contFreq(int[] arr, int length) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " --->" + entry.getValue());
		}

	}

}
