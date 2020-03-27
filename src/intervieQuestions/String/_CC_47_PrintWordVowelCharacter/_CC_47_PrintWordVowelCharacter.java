package intervieQuestions.String._CC_47_PrintWordVowelCharacter;

public class _CC_47_PrintWordVowelCharacter {

	public static void main(String[] args) {
		String str = "How good Is God";

		vowelCount(str);
		numberOfUpperCase(str);
		frequencyCount(str);
	}

	private static void numberOfUpperCase(String str) {
		int upperCase = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				upperCase++;
			}
		}
		System.out.println("Upper Case Letters : " + upperCase);

	}

	private static void vowelCount(String str) {
		int vowel = 0;
		System.out.println(str);
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
					|| str.charAt(i) == 'O' || str.charAt(i) == 'U') {
				vowel++;
			}
		}
		System.out.println("Vowels : " + vowel);

	}

	private static void frequencyCount(String str) {
		String string = "animainulkk";
		int[] freq = new int[26];

		for (int i = 0; i < string.length(); i++) {
			freq[string.charAt(i) - 'a']++;
		}

		for (int i = 0; i < string.length(); i++) {
			if (freq[string.charAt(i) - 'a'] != 0) {
				System.out.println(string.charAt(i) + "----" + freq[string.charAt(i) - 'a']);
				freq[string.charAt(i) - 'a'] = 0;
			}

		}
	}
}
