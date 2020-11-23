package javastrings.Class.String;

public class _11_StringContains {

	public static void main(String[] args) {
		String nameString = "What do you know about me";
		System.out.println(nameString.contains("do you")); // true
		System.out.println(nameString.contains("about")); // true
		System.out.println(nameString.contains("About")); // false // case sensitive
		
		if(nameString.contains("me")) {
			System.out.println("You know me.");
		}
		else {
			System.out.println("You don'tnow me..");
		}
	
	
	}

}
