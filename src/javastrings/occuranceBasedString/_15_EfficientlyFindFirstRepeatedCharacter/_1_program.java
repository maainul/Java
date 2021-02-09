/**
 * @Author Md. Mainul Hasan
 * 
 * 11:02:08 AM
 * 
 * Nov 19, 2020
 *
 */
package javastrings.occuranceBasedString._15_EfficientlyFindFirstRepeatedCharacter;

import java.util.HashSet;

public class _1_program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "abcfdeacf";
		int i = firstRepeated(s);
		if (i != -1)
			System.out.println("Char = " + s.charAt(i) + "   and Index = " + i);
		else
			System.out.println("No repeated Char");

		String s2 = "abcfdecf";
		int i2 = firstRepeatedHashSet(s2);
		if (i2 != -1)
			System.out.println("Char = " + s2.charAt(i2) + "   and Index = " + i2);
		else
			System.out.println("No repeated Char");

	}

	private static int firstRepeated(String s) {
		int[] freq = new int[26];
		for (int i = 0; i < s.length(); i++) {
			int v = s.charAt(i) - 'a';
			freq[v]++;
			if (freq[v] > 1) {
				return i;
			}
		}
		return -1;
	}

	private static int firstRepeatedHashSet(String s) {
		HashSet<Character> set = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			if (set.contains(s.charAt(i))) {
				return i;
			} else {
				set.add(s.charAt(i));
			}
		}

		return -1;
	}

}
