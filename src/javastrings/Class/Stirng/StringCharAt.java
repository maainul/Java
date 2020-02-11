package javastrings.Class.Stirng;

public class StringCharAt {

	public static void main(String[] args) {
		String s1 = "Mainul";
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(3));
		// character with index number.. 
		for (int i = 0; i < s1.length(); i++) {
			System.out.println(s1.charAt(i));
		}
		// character with condition
		System.out.println("Find odd number of Character:");
		for (int i = 0; i < s1.length(); i++) {
			if(i%2 != 0) {
				System.out.println(s1.charAt(i));	
			}
		}
		// count number of repeated character
		int count = 0;
		System.out.println("Count of Character:");
		for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i) == 'a') {
				System.out.println(s1.charAt(i));	
				count++;
			}
		}
		System.out.println(count);
		System.out.println(s1.length());

	}
}
