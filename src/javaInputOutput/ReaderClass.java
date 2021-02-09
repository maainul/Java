package javaInputOutput;

import java.io.FileReader;
import java.io.Reader;

public class ReaderClass {

	public static void main(String[] args) {
		try {
			Reader reader = new FileReader("D:\\output.txt");
			int data = reader.read();
			while (data != -1) {
				System.out.print((char) data);
				data = reader.read();
			}
			reader.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
