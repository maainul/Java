/**
 * @Author Md. Mainul Hasan
 * 
 * 10:10:30 AM
 * 
 * Nov 19, 2020
 *
 */
package javastrings.occuranceBasedString.f_14_FindtheMostRepeatedWordInAString;

import java.util.HashMap;
import java.util.Map;

/*
Most frequent word in an array of strings
Last Updated: 31-01-2020
Given an array of words find the most occurring word in it

Examples:

Input : arr[] = {"geeks", "for", "geeks", "a", 
                "portal", "to", "learn", "can",
                "be", "computer", "science", 
                 "zoom", "yup", "fire", "in", 
                 "be", "data", "geeks"}
Output : Geeks 
"geeks" is the most frequent word as it 
occurs 3 times
 */
public class _1_Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] A = { "geeks", "for", "geeks", "a", "portal", "to", "learn", "can", "be", "computer", "science",
				"zoom", "yup", "fire", "in", "be", "data", "geeks" };
		System.out.println("String with second highest frequency is: " + stringWithHighestFrequency(A));

	}

	private static String stringWithHighestFrequency(String[] a) {
		HashMap<String, Integer> hashMap = new HashMap<>();

		for (int i = 0; i < a.length; i++) {
			Integer repeatedInteger = hashMap.get(a[i]);
			hashMap.put(a[i], (repeatedInteger == null) ? 1 : repeatedInteger + 1);
		}
		/*
		 * // Iterate through array of words for (int i = 0; i < a.length; i++) { // If
		 * word already exist in HashMap then increase it's count by 1 if
		 * (hashMap.containsKey(a[i])) { hashMap.put(a[i], hashMap.get(a[i]) + 1); } //
		 * Otherwise add word to HashMap else { hashMap.put(a[i], 1); } }
		 */
		int higest_repeated_freq = 0;

		for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			// Library function
			// higest_repeated_freq = Math.max(higest_repeated_freq, entry.getValue());
			// without library function
			if (higest_repeated_freq < entry.getValue()) {
				higest_repeated_freq = entry.getValue();
			}

		}

		for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			if (entry.getValue() == higest_repeated_freq) {
				return entry.getKey();
			}
		}

		return null;
	}

}
