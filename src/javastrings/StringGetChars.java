package javastrings;

public class StringGetChars {

	public static void main(String[] args) {
		String string = new String("Hello javaworld");
		char[] ch = new char[10];
		try {
			string.getChars(6, 15, ch, 0);
			System.out.println(ch);
		} catch (Exception ex) {
			System.out.println(ex);
		}

	}

}
