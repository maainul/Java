package javastrings;

public class ReplaceMethod {

	public static void main(String[] args) {
		String s1 = "Java is a programming language.Java is a iceland";
		System.out.println(s1);
		String replaceString = s1.replace("Java", "Kava");
		System.out.println(replaceString);
		System.out.println(replaceString.replace("Kava", "Java"));
	}
}
