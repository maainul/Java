package interviewQuestions.occuranceBasedString._1_FindFIrstNotRepeatedStrings;

/**
 * @author mainul Nov 17, 2020
 *
 */
/*
 * Input: "geeksforgeeks" Explanation: Step 1: Construct a character count array
 * from the input string. .... count['e'] = 4 count['f'] = 1 count['g'] = 2
 * count['k'] = 2 ……
 * 
 * Step 2: Get the first character who's count is 1 ('f').
 * 
 * 
 * 
 */

// Java program to find first
// non-repeating character
public class _1_Program {
	static final int NO_OF_CHARS = 256;
	static char count[] = new char[NO_OF_CHARS];

	/*
	 * calculate count of characters in the passed string
	 */

	/*
	 * The method returns index of first non-repeating character in a string. If all
	 * characters are repeating then returns -1
	 */
	static int firstNonRepeating(String str) {

		int index = -1, i;
		for (i = 0; i < str.length(); i++)
			count[str.charAt(i)]++;
		for (i = 0; i < str.length(); i++) {
			if (count[str.charAt(i)] == 1) {
				index = i;
				break;
			}
		}

		return index;
	}

	// Driver method
	public static void main(String[] args) {
		String str = "geeksforgeeks";
		int index = firstNonRepeating(str);

		System.out.println(index == -1 ? "Either all characters are repeating or string " + "is empty"
				: "First non-repeating character is " + str.charAt(index));
	}
}
