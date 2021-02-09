package javastrings.Frequency_calculation;

public class JavaProgram {
	public static void main(String args[]) {
		String str = "This is not right time";
		int k, j;
		char c, ch;
		int i = str.length();
		for (c = 'A'; c <= 'z'; c++) {
			k = 0;
			for (j = 0; j < i; j++) {
				ch = str.charAt(j);
				if (ch == c) {
					k++;
				}
			}
			if (k > 0) {
				System.out.println("The character " + c + " has occurred for " + k + " times");
			}
		}
	}
}