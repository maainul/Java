package javastrings.Class.Stirng;

public class StringContains {

	public static void main(String[] args) {
		String nameString = "What do you know about me";
		System.out.println(nameString.contains("do you"));
		System.out.println(nameString.contains("about"));
		System.out.println(nameString.contains("About")); // case sensitive
		
		if(nameString.contains("me")) {
			System.out.println("You know me.");
		}
		else {
			System.out.println("You don'tnow me..");
		}
	
	
	}

}
