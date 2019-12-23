package javastrings;

public class StringTrimMethod {

	public static void main(String[] args) {
		String s1 = "  Mainul  ";
		System.out.println(s1);
		System.out.println(s1.length());
		//The string trim() method eliminates white spaces before and after string.
		String string = s1.trim();
		System.out.println(string); 
		System.out.println(string.length());
		

	}

}
