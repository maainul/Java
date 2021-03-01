package interviewQuestions.character_counting;

public class _CC_39_CheckIfFrequencyofAllCharactersCanBecomeSameByOneRemoval {

	public static void main(String[] args) {
		String str = "xyyzz";
		findAndReomove(str);

	}

	private static void findAndReomove(String str) {
		int[] freq = new int[26];
		for (int i = 0; i < freq.length; i++) {
			System.out.println(i + "---" + freq[i]);
		}

		for (int i = 0; i < str.length(); i++) {
			freq[str.charAt(i) - 'a']++;
		}
		System.out.println("After Add Frequency");
		for (int i = 0; i < freq.length; i++) {
			System.out.println(i + "---" + freq[i]);
		}

		for (int i = 0; i < str.length(); i++) {
			if (freq[str.charAt(i) - 'a'] != 0) {
				if (freq[str.charAt(i) - 'a'] == 1) {
					freq[str.charAt(i) - 'a'] = 0;
				}
			}

		}

		System.out.println("New Frequency 2");
		for (int i = 0; i < str.length(); i++) {
			if (freq[str.charAt(i) - 'a'] != 0) {
				System.out.print(str.charAt(i) + "--" + freq[str.charAt(i) - 'a'] + " ");
				freq[str.charAt(i) - 'a'] = 0;
			}

		}

	}

}
