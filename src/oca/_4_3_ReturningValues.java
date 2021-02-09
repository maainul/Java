package oca;

public class _4_3_ReturningValues {

	public static void main(String[] args) {
		int number = 1;
		String letter = "abc";
		number(number);
		// number = number(number); // uncomment and see the magic of java
		letter = letter(letter);
		System.out.println(number + letter);
	}

	private static String letter(String letter) {
		letter += "d";
		return letter;
	}

	private static int number(int number) {
		number++;
		return number;

	}

}
