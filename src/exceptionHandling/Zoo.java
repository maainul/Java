/**
 * @Author Md. Mainul Hasan
 * 
 * 11:59:30 AM
 * 
 * Oct 25, 2020
 *
 */
package exceptionHandling;

import java.util.Arrays;

public class Zoo {

	public static void main(String[] args) {
		String[] queries = { "cbd" };
		String[] words = { "zaaaz" };
		int[] re = numSmallerByFrequency(queries, words);
		System.out.println(Arrays.toString(re));
	}

	public static int[] numSmallerByFrequency(String[] queries, String[] words) {

		int[] res = new int[queries.length];
		for (int i = 0; i < queries.length; i++) {
			int count = 0;
			int frequency = freqcal(queries[i]);

			for (String word : words) {
				int wordFreq = freqcal(word);
				if (frequency < wordFreq) {
					count++;
				}
			}
			res[i] = count;
		}
		return res;

	}

	public static int freqcal(String string) {

		char[] temp = string.toCharArray();

		Arrays.sort(temp);

		int freq = 1;
		for (int i = 1; i < temp.length; i++) {
			if (temp[i - 1] != temp[i]) {
				break;
			} else {
				freq++;
			}

		}

		return freq;
	}

}
