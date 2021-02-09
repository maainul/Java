package javastrings.RemoveOrReplacePartOfAStringInJava;

public class _1_StringAPI {

	public static void main(String[] args) {
		String originalString = "Hello how are you?";
		String targetedString = "Hello";
		String replaceString = "Hi";
		String resultString = originalString.replace(targetedString, replaceString);
		System.out.println(resultString);

	}

}
