package javastrings.Class.String;

import java.util.ArrayList;

public class _12_StringEqualsTo {

	public static void main(String[] args) {
		String s1 = "Javapoint";
		String s2 = "Javapoint";
		String s3 = "JavaPoint";
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.equals(s3)); // false
		if (s1.equals(s2)) {
			System.out.println("Both are equal"); // both are equal
		} else {
			System.out.println("Not equal");
		}

		equalsMethodUsingList();

	}

	private static void equalsMethodUsingList() {
		String str1 = "Mohammad";

		ArrayList<String> list = new ArrayList<String>();
		list.add("Rahman");
		list.add("Rahim");
		list.add("Sattar");
		list.add("Jabbar");
		list.add("Mohammad");

		for (String str : list) {
			if (str.equals(str1)) {
				System.out.println("Mohammad(sm) is our messanger");
			}

		}

	}

}
