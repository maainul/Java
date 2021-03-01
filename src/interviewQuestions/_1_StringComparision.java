package interviewQuestions;

public class _1_StringComparision {

	public static void main(String[] args) {
		String s1 = "Mainul";
		String s2 = "Mainul";
		String s3 = "Hasan";
		String s4 = new String();
		s4 = "anik";
		String s5 = "mainul";
		String s6 = "MAINUL";
		// equals to
		System.out.println(s1.equals(s2)); // true
		System.out.println(s2.equals(s3)); // false
		System.out.println(s3.equals(s4)); // false
		System.out.println(s1.equals(s5)); // false
		System.out.println(s1.equals(s6)); // false

		// equalstoignore
		System.out.println(s1.equalsIgnoreCase(s6)); // true

		// == method
		System.out.println(s1 == s2); // true
		System.out.println(s1 == s5); // false
		/*
		 * compare to method s1 == s2 :0 s1 > s2 :positive value s1 < s2 :negative value
		 */
		System.out.println(s1.compareTo(s2)); // 0
		System.out.println(s1.compareTo(s4)); // -20

	}

}
