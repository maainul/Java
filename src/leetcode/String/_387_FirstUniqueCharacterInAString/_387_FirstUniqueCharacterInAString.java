/*********************************************************************
387. First Unique Character in a String (Easy)

Given a string, find the first non-repeating character in it and return it's index. 
If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.

Note: You may assume the string contain only lowercase letters.
*******************************************************************/

package leetcode.String._387_FirstUniqueCharacterInAString;

public class _387_FirstUniqueCharacterInAString {

	public static void main(String[] args) {
		String s = "leetlcode";
		System.out.println(firstUniqChar(s));

	}

	public static int firstUniqChar(String s) {
		int n = s.length();
		int[] freq = new int[26];

		for (int i = 0; i < n; i++) {
			freq[s.charAt(i) - 'a']++;
		}

		for (int i = 0; i < n; i++) {
			if (freq[s.charAt(i) - 'a'] == 1) {
				return i;
			}
		}

		return -1;

	}

}
