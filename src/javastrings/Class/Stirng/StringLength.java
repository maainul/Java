package javastrings.Class.Stirng;

public class StringLength {

	public static void main(String[] args) {
		String s1 = "javapoint";
		String s2 = "Python";
		System.out.println("String length :"+s1.length());
		System.out.println("string length :"+ s2.length());
		if(s1.length() > 0) {
			System.out.println("String is not empty...");
		}
		else {
			System.out.println("String is empty..");
		}
		s1 = "";
		if(s1.length()== 0) {
			System.out.println("string is empty...");
		}
	}
}

/*
 * String length :9 
 * string length :6 
 * String is not empty... 
 * string is empty...
 */

