package interviewQuestions;

public class _6_StringWithkDistinctCharactersAndNoSameCharactersAdjacent {
	// Java program to construct a n length
	// string with k distinct characters
	// such that no two same characters
	// are adjacent.
	// Function to find a string of
	// length n with k distinct characters.
	static String findString(int n, int k) {

		// Initialize result with first k
		// Latin letters
		StringBuilder res = new StringBuilder();

		for (int i = 0; i < k; i++)
			res.append((char) ('a' + i));

		// Fill remaining n-k letters by
		// repeating k letters again and
		// again.
		int count = 0;

		for (int i = 0; i < n - k; i++) {
			res.append((char) ('a' + count));
			count++;

			if (count == k)
				count = 0;
		}

		return res.toString();
	}

	// Driver code
	static public void main(String[] args) {

		int n = 5, k = 2;

		System.out.println(findString(n, k));
	}
}
