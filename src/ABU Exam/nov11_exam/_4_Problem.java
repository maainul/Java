package nov11;

import java.util.Stack;

public class _4_Problem {

	public static void main(String[] args) {
		String string = "[()]{}{[()()]}";

		boolean b = checkString(string);

		if (b) {
			System.out.println("Balanced");
		} else {
			System.out.println("Unbalanced");
		}

	}

	private static boolean checkString(String string) {
		Stack<Character> stack = new Stack();

		char[] c = string.toCharArray();

		for (int i = 0; i < c.length; i++) {
			if (c[i] == '(') {
				stack.push('(');
			} else if (c[i] == '{') {
				stack.push('{');
			} else if (c[i] == '[') {
				stack.push('[');
			} else if (c[i] == ')') {
				stack.pop();
			} else if (c[i] == '}') {
				stack.pop();
			} else if (c[i] == ']') {
				stack.pop();
			}

		}

		return stack.isEmpty();

	}

}
