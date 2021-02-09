package javaInputOutput;

public class StringReader {

	public static void main(String[] args) {
		try {
			String string = "hello !it is not well";
			java.io.StringReader name = new java.io.StringReader(string);

			int k = 0;

			while ((k = name.read()) != -1) {
				System.out.print((char) k);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
