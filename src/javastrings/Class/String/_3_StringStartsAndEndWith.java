package javastrings.Class.String;

public class _3_StringStartsAndEndWith {

	public static void main(String[] args) {
		String s1 = "Mainul";
		System.out.println(s1.startsWith("a")); //false
		System.out.println(s1.startsWith("m")); // case sensitive //false
		System.out.println(s1.startsWith("M")); //true
		System.out.println(s1.endsWith("l")); //true
		System.out.println(s1.endsWith("L")); //false
		
		if(s1.endsWith("ul")) {
			System.out.println("You know me");
		}
		else {
			System.out.println("You don't know me");
		}
	}

}
/*
false
false
true
true
false
You don't know me
*/