package javaInputOutput;

public class FileReader {

	public static void main(String[] args) {
		try {
			java.io.FileReader fileReader = new java.io.FileReader("D:\\testout.txt");
			int i;
			while ((i = fileReader.read()) != -1) {
				System.out.print((char) i);
			}
			fileReader.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
