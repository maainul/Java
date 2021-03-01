package interviewQuestions.character_counting;

import java.util.Arrays;

public class BubbleSortOfString {

	public static void main(String[] args) {
		String string[] = { "tumi", "se", "ami", "tahrara" };

		// Arrays.sort(string);
		// System.out.println(Arrays.toString(string));

		for (int i = 0; i < string.length - 1; i++) {
			for (int j = i + 1; j < string.length; j++) {
				if (string[i].compareTo(string[j]) > 0) {
					String tempString = string[i];
					string[i] = string[j];
					string[j] = tempString;
				}
			}
		}
		System.out.println(Arrays.toString(string));

	}

}
