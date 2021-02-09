package javastrings.Class.String;

// The java string replaceAll() method returns a string replacing all 
// the sequence of characters matching regex and replacement strin

public class _21_StringReplaceAll {

	public static void main(String[] args) {
		String s1 = "javatpoint is a very good website";
		String replaceString = s1.replaceAll("a", "e");// replaces all occurrences of "a" to "e"
		System.out.println(replaceString);
		System.out.println(s1.replaceAll("is", "was"));

	}

}
// jevetpoint is e very good website
// javatpoint was a very good website