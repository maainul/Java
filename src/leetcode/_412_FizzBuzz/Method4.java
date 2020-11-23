package leetcode._412_FizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class Method4 {

	public static void main(String[] args) {
		int n = 15;
		List<String> strings = fizBuzz(n);

		for (int i = 0; i < n; i++) {
			System.out.println(strings.get(i));
		}

	}

	private static List<String> fizBuzz(int n) {
		List<String> list = new ArrayList<String>();
		for (int i = 1; i <= n; i++) {
			String currentString = "";
			if (i % 3 == 0) {
				currentString = "Fizz";
			}
			if (i % 5 == 0) {
				currentString += "Buzz";
			}

			if (currentString.length() == 0) {
				currentString = String.valueOf(i);
			}

			list.add(currentString);
		}
		return list;
	}

}
