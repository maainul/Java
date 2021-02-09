package javaInputOutput;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReaderClass {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("D:\\testout.txt");
			BufferedReader bufferedReader = new BufferedReader(fr);

			int i;
			while ((i = bufferedReader.read()) != -1) {
				System.out.print((char) i);
			}
			bufferedReader.close();
			fr.close();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
