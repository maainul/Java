package interviewQuestions;

public class _14_LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strs = { "flower", "flow", "flight", "flew", "fletch" };
		longestCommonPrefix(strs);

	}

	public static String longestCommonPrefix(String[] strs) {

		StringBuilder longestCommonPrefixString = new StringBuilder();

		if (strs == null || strs.length == 0) {
			return longestCommonPrefixString.toString();
		}

		int index = 0;
		for (char c : strs[0].toCharArray()) {
			System.out.print(c);
			for (int i = 1; i < strs.length; i++) {
				if (index >= strs[i].length() || c != strs[i].charAt(index)) {
					return longestCommonPrefixString.toString();
				}
			} // for loop
			longestCommonPrefixString.append(c);
			index++;
		} // for each loop
		return longestCommonPrefixString.toString();

	}
}
