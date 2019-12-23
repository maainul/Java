package javastrings;

public class StringReplaceMethod {

	public static void main(String[] args) {
		String s1 = "Java is a programming language.Java is a iceland";
		System.out.println(s1);
		String replaceString = s1.replace("Java", "Kava");
		System.out.println(replaceString);
		System.out.println(replaceString.replace("Kava", "Java"));
		System.out.println(s1.replace("a", "A"));
	}
}
/*
 *  Java is a programming language.Java is a iceland
 *  Kava is a programming language.Kava is a iceland 
 *  Java is a programming language.Java is a iceland
 *  JAvA is A progrAmming lAnguAge.JAvA is A icelAnd
 */
