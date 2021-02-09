/*
 * 344. Reverse String (Easy)

Write a function that reverses a string. The input string is given as an array of characters char[].

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

You may assume all the characters consist of printable ascii characters.

 

Example 1:

Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 */
package leetcode;

public class _344_ReverseString {

	public static void main(String[] args) {
		String string = "hello";
		char[] s = string.toCharArray();
		System.out.print("Before reverse string = ");
		for (int i = 0; i < string.length(); i++) {
			System.out.print(s[i]);
		}
		int l = 0, r = s.length - 1;

		while (l < r) {
			char temp = s[l];
			s[l] = s[r];
			s[r] = temp;
			l++;
			r--;
		}
		System.out.print("\nAfter reverse string = ");
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]);
		}

	}

}
