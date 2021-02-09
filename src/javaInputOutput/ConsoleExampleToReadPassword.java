package javaInputOutput;

import java.io.Console;

public class ConsoleExampleToReadPassword {

	public static void main(String[] args) {
		Console console = System.console();
		System.out.println("Enter your pass:");

		char[] ch = console.readPassword();
		// converting char array into string
		String passString = String.valueOf(ch);
		System.out.println("pass: " + passString);

	}

}
