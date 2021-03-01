package interviewQuestions.Class.String;

import java.util.ArrayList;

public class _13_StringEqualsIgnoreCase {

	public static void main(String[] args) {
		String s1 = "Javapoint";
		String s2 = "JAVAPOINT";
		String s3 = "JavaTPoint";
		String s4 = "JavaTPOINT";

		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equalsIgnoreCase(s4));

		// if we ignore the cases both the strings are equal.
		// it will ignore case sensivity
		boolean result1 = s2.equalsIgnoreCase(s1);
		System.out.println("str2 is equal to str1 = " + result1);

		// even if ignoring the cases both the strings are not equal.
		boolean result2 = s2.equalsIgnoreCase(s3);
		System.out.println("str2 is equal to str3 = " + result2);

		equalsIgnoreCaseMethodUsingList();

	}

	private static void equalsIgnoreCaseMethodUsingList() {

		String str1 = "Mohammad";

		ArrayList<String> list = new ArrayList<String>();
		list.add("Rahman");
		list.add("Rahim");
		list.add("Sattar");
		list.add("Jabbar");
		list.add("Mohammad");

		for (String str : list) {
			if (str.equalsIgnoreCase(str1)) {
				System.out.println("Mohammad(sm) is our messanger");
			}

		}

	}

}
/*
 * true false false Mohammad(sm) is our messanger
 */
