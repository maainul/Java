/*
 * (https://codedestine.com/ransom-note-string-problem/)
383. Ransom Note Easy

Given an arbitrary ransom note string and another string containing letters from all the magazines, 
write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

Each letter in the magazine string can only be used once in your ransom note.

Note:
You may assume that both strings contain only lowercase letters.

canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true

 */
package leetcode;

public class _383_RansomNote {

	public static void main(String[] args) {
		_383_RansomNote main = new _383_RansomNote();
		boolean result = main.canConstruct("aa", "ab");
		System.out.println(result);
	}

	/* Solution */
	public boolean canConstruct(String ransomNote, String magazine) {
		// 1. store the count of each of the characters in an array.
		int[] array = new int[26];
		// 2. Traverse the string, character by character and
		for (int i = 0; i < magazine.length(); i++) {
			// 3. store the count of each of the characters in an array.
			array[magazine.charAt(i) - 'a']++;
		}

		for (int i = 0; i < ransomNote.length(); i++) {
			if (array[ransomNote.charAt(i) - 'a'] > 0) {
				array[ransomNote.charAt(i) - 'a']--;
			} else {
				return false;
			}

		}
		return true;

	}
}