package interviewQuestions.character_counting;
// https://www.sanfoundry.com/java-program-find-largest-smallest-word/

//Java program to Find the Largest and Smallest Word.

public class _14_ProgramtoFindSmallestAndLargestWordInaString {
	public static void main(String args[]) {
		String str = "This is mainul Hasan";
		largestAndSmallWord(str);
	}

	public static void largestAndSmallWord(String s) {
		// 1. split word
		// String result = "AniMal ".trim().toLowerCase().replace('a', 'A');
		// System.out.print(result);
		String[] arr = s.split(" ");
		// 2. Declare value
		int maxLength, minLength;
		String smallest, largest;
		smallest = largest = "";
		// assign value max and min
		maxLength = Integer.MIN_VALUE;
		minLength = Integer.MAX_VALUE;
		// loop through all word
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() < minLength) {// minLength = 2147483648
				minLength = arr[i].length();
				smallest = arr[i];
			}
			if (arr[i].length() > maxLength) { // maxLength = -2147483648
				maxLength = arr[i].length();
				largest = arr[i];
			}
		}

		System.out.println("Largest value :" + largest + "\nSmallest Word : " + smallest);
	}

}