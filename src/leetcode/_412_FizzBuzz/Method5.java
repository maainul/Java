package leetcode._412_FizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class Method5 {

	public static void main(String[] args) {
		int n = 15;
		List<String> result = fizzBuzz(n);
		for (int i = 0; i < n; i++) {
			System.out.println(result.get(i));
		}
	}

	public static List<String> fizzBuzz(int n) {
		List<String> list = new ArrayList<>(n);
		if (n == 0) {
			return list;
		}
		int index = 0;
		while (++index <= n) {
			if (index % 3 != 0 && index % 5 != 0) {
				list.add(String.valueOf(index));
				continue;
			}
			if (index % 3 == 0 && index % 5 != 0) {
				list.add("Fizz");
				continue;
			}
			if (index % 5 == 0 && index % 3 != 0) {
				list.add("Buzz");
				continue;
			}
			if (index % 3 == 0 && index % 5 == 0) {
				list.add("FizzBuzz");
				continue;
			}
		}
		return list;
	}

}
