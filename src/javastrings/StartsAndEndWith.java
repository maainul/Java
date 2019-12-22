package javastrings;

public class StartsAndEndWith {

	public static void main(String[] args) {
		String s1 = "Mainul";
		System.out.println(s1.startsWith("a"));
		System.out.println(s1.startsWith("m")); // case sensitive
		System.out.println(s1.startsWith("M"));
		System.out.println(s1.endsWith("l"));
		System.out.println(s1.endsWith("L"));
	}

}
