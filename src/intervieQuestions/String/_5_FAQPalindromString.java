package intervieQuestions.String;

public class _5_FAQPalindromString {
	public static void main(String args[]) {
		String string = "BdidB"; // create a string variable
		
		StringBuilder stringBuilder = new StringBuilder(string); // give the value to the string buffer/builder
		stringBuilder.reverse(); // reverse the string using object.
		
		String reverseString = stringBuilder.toString(); 
		// to string method for create string
		// because stringbufer class don't have equals method
		System.out.println(reverseString);
		
		if(string.equals(reverseString)) {
			System.out.println("Palindrom");
		}
		else {
			System.out.println("Not Palindrom");
		}
	}
	
}
