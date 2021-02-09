package dataStructureAndAlgorithm.hackerRank;

public class CountingValleys {
	public static void main(String[] args) {
		String str = "UDDDUDUU";

		System.out.println(countVal(str));

	}

	private static int countVal(String str) {

		int level = 0; // 0 is sea-level
		int valleys = 0;

		for (char c : str.toCharArray()) {
			if (c == 'U') {
				level++;
				if (level == 0) {
					valleys++;
				}
			} else {
				level--;
			}
		}
		return valleys;

	}

}
