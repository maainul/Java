package javastrings.character_counting;

public class _CC_6_StringWithKDistinctCharactersAndNoSameCharactersAdjacent {

	public static void main(String[] args) {
		System.out.println("Strings and its distinct char");
		int n = 5, k = 2;
		System.out.println(distinctcharCheck(n, k));
	}

	private static String distinctcharCheck(int n, int k) {
		String result = "";
		for (int i = 0; i < k; i++) {
			result = result + (char) ('a' + i);
		}

		for (int i = 0; i < n - k; i++) {
			result = result + (char) ('a' + i);
		}

		return result;
	}
}
