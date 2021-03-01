package interviewQuestions.Class.String;

// The java string charAt() method returns a char value at the given index number.
public class _4_StringCharAt {

	public static void main(String[] args) {
		String s1 = "Mainul";
		System.out.println(s1.charAt(0)); // M
		System.out.println(s1.charAt(3)); // n
		// character with index number..
		for (int i = 0; i < s1.length(); i++) {
			System.out.println(s1.charAt(i));
		} // m a i n u l
			// character with condition
		System.out.println("Find odd number of Character:");
		for (int i = 0; i < s1.length(); i++) {
			if (i % 2 != 0) {
				System.out.println(s1.charAt(i));
			}
		} // a n l
			// count number of repeated character
		int count = 0;
		System.out.println("Count of Character:");
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == 'a') {
				System.out.println(s1.charAt(i));
				count++;
			}
		} // a 1
		System.out.println(count); // 1
		System.out.println(s1.length()); // 6

	}
}
