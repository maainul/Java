package javastrings;

public class StringEqualsTo {

	public static void main(String[] args) {
		String s1 = "Javapoint";
		String s2 = "Javapoint";
		String s3 = "JavaPoint";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		if(s1.equals(s2)) {
			System.out.println("Both are equal");
		}
		else {
			System.out.println("Not equal");
		}

	}

}
