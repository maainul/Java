package javastrings.character_counting;

public class FindDuplicateArrayOfString {

	public static void main(String[] args) {

		String string[] = { "tumi", "se", "ami", "tahrara", "tumi" };
		for (int i = 0; i < string.length - 1; i++) {
			for (int j = i + 1; j < string.length; j++) {
				if (string[i].equals(string[j])) {
					System.out.println(string[j]);

				}
			}
		}

	}

}
