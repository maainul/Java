package dataStructureAndAlgorithms.String.SubstringSearch.BruteForce;

public class BruteForceSubstringSearch {

	public static void main(String[] args) {
		String txt = "hello", pat = "a";
		System.out.println(bruteforceSearch(txt, pat));

	}

	private static int bruteforceSearch(String txt, String pat) {

		int M = pat.length();
		int N = txt.length();
		for (int i = 0; i <= N - M; i++) {
			int j;
			for (j = 0; j < M; j++) {
				if (txt.charAt(i + j) != pat.charAt(j)) {
					break;
				}
					
			}
			if (j == M)
				return i; // found // index in the text where pattern start.
		}
		return N; // not found
	}
}
