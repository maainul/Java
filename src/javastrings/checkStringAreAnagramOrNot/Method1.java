package javastrings.checkStringAreAnagramOrNot;

public class Method1 {

	public static void main(String[] args) {
		String str1 = "cat";
		String str2 = "act";
		anagram(str1, str2);
	}

	private static void anagram(String str1, String str2) {
		int len1 = str1.length();
		int len2 = str2.length();
		boolean found_flag = false;
		boolean not_found = false;

		if (len1 == len2) {
			for (int i = 0; i < len1; i++) {
				for (int j = 0; j < len2; j++) {
					if (str1.charAt(i) == str2.charAt(j)) {
						found_flag = true;
						break;
					}
				}
				if (found_flag == false) {
					not_found = true;
					break;
				}
			}
			if (not_found == true) {
				System.out.println("Not Anagram");
			} else {
				System.out.println("Found");
			}
		} else {
			System.out.println("Both length have to be same for anagram");
		}
	}
}
