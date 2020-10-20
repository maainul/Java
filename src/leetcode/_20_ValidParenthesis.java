/**
 * @Author Md. Mainul Hasan
 * 
 * 2:13:17 AM
 * 
 * Oct 17, 2020
 *
 */
package leetcode;

import java.util.HashMap;
import java.util.Stack;

public class _20_ValidParenthesis {
	/*
	 * Given a string s containing just the characters '(', ')', '{', '}', '[' and
	 * ']', determine if the input string is valid.
	 * 
	 * An input string is valid if:
	 * 
	 * Open brackets must be closed by the same type of brackets. Open brackets must
	 * be closed in the correct order.
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: s = "()" Output: true Example 2:
	 * 
	 * Input: s = "()[]{}" Output: true Example 3:
	 * 
	 * Input: s = "(]" Output: false Example 4:
	 * 
	 * Input: s = "([)]" Output: false Example 5:
	 * 
	 * Input: s = "{[]}" Output: true
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= s.length <= 104 s consists of parentheses only '()[]{}'.
	 */
	/**
	 * @param args
	 */

	public static void main(String[] args) {
		String s = "(){}[]";
		boolean b = isValid(s);
		System.out.println(b);

		String s2 = "(){}[]";
		boolean bb = isValidHashMap(s2);
		System.out.println(bb);
	}

	private static boolean isValidHashMap(String s2) {
		HashMap<Character, Character> map = new HashMap<Character, Character>();

		map.put('(', ')');
		map.put('{', '}');
		map.put('[', ']');

		Stack<Character> stack = new Stack<Character>();
		for (char c : s2.toCharArray()) {
			if (map.keySet().contains(c)) {
				stack.push(c);
			} else if (map.values().contains(c)) {
				if (!stack.empty() && map.get(stack.peek()) == c) {
					stack.pop();
				} else {
					return false;
				}
			}

		}
		return stack.empty();
	}

	public static boolean isValid(String s) {

		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			} else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			} else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			} else {
				stack.push(c);
			}

		}
		return stack.isEmpty();

	}

}
