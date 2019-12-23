package javastrings;

public class StringEndsWith {

	public static void main(String[] args) {
		String nameString = "What do you know about me";
		System.out.println(nameString.endsWith("me"));
		System.out.println(nameString.endsWith("d"));
		if(nameString.endsWith("me")) {
			System.out.println("You know me");
		}
		else {
			System.out.println("You don't know me");
		}
		

	}

}
