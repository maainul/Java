/**
 * 
 */
package javastrings.occuranceBasedString._11_findtheFirstRepeatedWordInAString;

import java.util.HashSet;

/**
 * @author mainul Nov 18, 2020
 *
 */
public class _1_Program {

	static String repeat_first(String my_str[]) {
		HashSet<String> my_hash = new HashSet<>();
		for (int i = 0; i <= my_str.length - 1; i++) {
			String c = my_str[i];
			if (my_hash.contains(c))
				return c;
			else
				my_hash.add(c);
		}
		
		return null;
	}

	public static void main(String[] args) {
		String my_str = "this is a sample only sample";
		String[] my_arr = my_str.split(" ");
		System.out.println("The first repeating character in the string is :");
		System.out.println(repeat_first(my_arr));
	}
}