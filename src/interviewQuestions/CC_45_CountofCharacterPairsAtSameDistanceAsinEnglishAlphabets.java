package interviewQuestions;

public class CC_45_CountofCharacterPairsAtSameDistanceAsinEnglishAlphabets {
	public static void main(String[] args) {
		String str = "oservation";
		int result = 0;
		int n = str.length();
		for (int i = 0; i < n; i++)
			for (int j = i + 1; j < n; j++)

				// Increment count if characters
				// are at same distance
				if (Math.abs(str.charAt(i) - str.charAt(j)) == Math.abs(i - j))
					result++;

		System.out.println(result);
	}
}