package nov18;

public class _3_Program {
	public static void main(String[] args) {
		float number = 3.1415926535f;

		System.out.println(stringCount(number));

	}

	public static int stringCount(float number) {

		String string = String.valueOf(number);
		// System.out.println(string);
		char[] ch = string.toCharArray();

		// System.out.println(Arrays.toString(ch));

		int count = 0;
		for (int i = ch.length - 1; i >= 1; i--) {
			if (ch[i] == '.') {
				return count;
			}
			count++;

		}
		return count;
	}

}
