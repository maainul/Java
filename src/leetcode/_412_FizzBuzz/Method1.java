package leetcode._412_FizzBuzz;

/*
Write a program that outputs the string representation of numbers from 1 to n.

But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”.

For numbers which are multiples of both three and five output “FizzBuzz”.

Example:

n = 15,

Return:
[
    "1",
    "2",
    "Fizz",
    "4",
    "Buzz",
    "Fizz",
    "7",
    "8",
    "Fizz",
    "Buzz",
    "11",
    "Fizz",
    "13",
    "14",
    "FizzBuzz"
]

 */

import java.util.ArrayList;
import java.util.List;

public class Method1 {

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
			if (i % 3 == 0 && i % 5 == 0) {
				list.add("FizzBuzz");
			} else if (i % 3 == 0) {
				list.add("Fizz");
			} else if (i % 5 == 0) {
				list.add("Buzz");
			} else {
				list.add(String.valueOf(i));
			}
		}
		return list;

	}

}
