package javastrings.Class.Stirng;

public class StringStartsAndEndWith {

	public static void main(String[] args) {
		String s1 = "Mainul";
		System.out.println(s1.startsWith("a"));
		System.out.println(s1.startsWith("m")); // case sensitive
		System.out.println(s1.startsWith("M"));
		System.out.println(s1.endsWith("l"));
		System.out.println(s1.endsWith("L"));
		if(s1.endsWith("me")) {
			System.out.println("You know me");
		}
		else {
			System.out.println("You don't know me");
		}
	}

}
