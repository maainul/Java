/**
 * @Author Md. Mainul Hasan
 * 
 * 2:36:21 AM
 * 
 * Nov 7, 2020
 *
 */
package interviewQuestions;

public class _925_LongPressedName {

	public static boolean iisLongPressedName(String name, String typed) {
		if (name.equals(typed)) {
			return true;
		}
		int nameIndex = 0;
		int typedIndex = 0;

		char[] nameChars = name.toCharArray();
		char[] typedChars = typed.toCharArray();

		while (typedIndex < typed.length()) {
			if (nameIndex < name.length() && nameChars[nameIndex] == typedChars[typedIndex]) {
				nameIndex++;
				typedIndex++;
			} else if (typedIndex > 0 && typedChars[typedIndex] == typedChars[typedIndex - 1]) {
				typedIndex++;
			} else {
				return false;
			}
		}

		return nameIndex == name.length();
	}

	// test case failed
	public static boolean isLongPressedName(String name, String typed) {
		int[] freqA = new int[26];
		int[] freqB = new int[26];

		for (int i = 0; i < name.length(); i++) {
			int a = name.charAt(i);
			freqA[a - 'a']++;
		}

		for (int i = 0; i < typed.length(); i++) {
			int b = typed.charAt(i);
			freqB[b - 'a']++;
		}

		for (int i = 0; i < name.length(); i++) {
			if (freqA[name.charAt(i) - 'a'] != 0) {

				if (freqA[name.charAt(i) - 'a'] <= freqB[typed.charAt(i) - 'a']) {
					continue;
				} else {
					return false;
				}
			}
		}

		return true;
	}

	public static void main(String[] args) {
		String name = "alex";
		String typed = "aaleexs";
		System.out.println(isLongPressedName(name, typed));
		System.out.println(iisLongPressedName(name, typed));

	}

}
