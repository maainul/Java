package javastrings.Class.Stirng;

public class StringTrimMethod {

	public static void main(String[] args) {
		String s1 = "  Mainul  ";
		System.out.println(s1);
		System.out.println(s1.length());
		//The string trim() method eliminates white spaces before and after string.
		String string = s1.trim();
		System.out.println(string); 
		System.out.println(string.length());
		
		// jodi empty string hoi tahole true show korbe
		String s = "";
		System.out.println("Empty string :"+ s.isEmpty());
		
		// jodi empty string  na hoi tahole false show korbe
		String s2 = "bb";
		System.out.println("With character/String :"+ s2.isEmpty());
		
		// jodi kono char na theke sudhu faka thake taholeo false dekhabe
		// karon space o ekta special character....
		String s3 = " ";
		System.out.println("Specaial character/space :"+ s3.isEmpty());
		
		// trim kore // trim korleo empty string hoi 
		System.out.println("Specaial character/space/trim :"+ s3.trim().isEmpty());
	}

}
