package interviewQuestions;

public class _1160_FindWordsThatCanBeFormedbyCharacters {

	public static void main(String[] args) {
		String words[] = { "cat", "bt", "hat", "tree" };
		String chars = "atach";
		System.out.println(countCharacters2(words, chars));
	}

	public static int countCharacters2(String[] words, String chars) {
		int total = 0;
		for (int i = 0; i < words.length; i++) {
			String a = words[i];
			if (a == null || a == "") {
				continue;
			}
			String[] temp = a.split("");
			int len = 0;
			String tempStr = chars;
			for (int j = 0; j < temp.length; j++) {

				if (tempStr.contains(temp[j])) {
					len++;
					tempStr = tempStr.replaceFirst(temp[j], "");
				}
			}
			if (len == temp.length) {
				total += len;
			}
		}
		return total;

	}
}
