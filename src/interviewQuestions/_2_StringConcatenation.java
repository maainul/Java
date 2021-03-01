package interviewQuestions;

public class _2_StringConcatenation {

	public static void main(String[] args) {
		String s1 = "Mainul";
		String s2 = "Mainul";
		String s3 = "Hasan";
		// by + method
		System.out.println(s1 + " " + s3);
		// by concat()
		System.out.println(s1.concat(s2)); // without space
		System.out.println(s1.concat(" ").concat(s3));

	}

}
/*
 * Output
 * 
 * Mainul Hasan MainulMainul Mainul Hasan
 * 
 * 
 */