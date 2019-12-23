package javastrings;

public class StringIsEmpty {

	public static void main(String[] args) {
		String s1 = "";
		String s2 = "Javaworld";
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
		if(s1.length()== 0 || s1.isEmpty()) {
			System.out.println("String s1 is empty...");
		}
		else {
			System.out.println(s1);
		}
		if(s2.length()==0 || s2.isEmpty()) {
			System.out.println("S2 is empty..");
		}
		else {
			System.out.println(s2);
		}
	}

}
/*
 * true 
 * false 
 * String s1 is empty... 
 * Javaworld
 */