package interviewQuestions._412_FizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class Method3 {

	public static void main(String[] args) {
		int n = 15;
		List<String> strings = fizBuzz(n);

		for (int i = 0; i < n; i++) {
			System.out.println(strings.get(i));
		}

	}

	private static List<String> fizBuzz(int n) {
		List<String> list = new ArrayList<String>();
		;
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0) {
				if (i % 5 == 0) {
					list.add("FizzBuzz");
				} else {
					list.add("Fizz");
				}
			} else if (i % 5 == 0) {
				list.add("Buzz");
			} else {
				list.add(String.valueOf(i));
			}
		}
		return list;
	}

}
