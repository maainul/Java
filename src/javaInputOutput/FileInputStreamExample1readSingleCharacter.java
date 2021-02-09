package javaInputOutput;

import java.io.FileInputStream;

public class FileInputStreamExample1readSingleCharacter {

	public static void main(String[] args) {
		try {
			String file = "C:\\Users\\Md.Mainul hasan anik\\gitrepo\\Java\\src\\javaInputOutput\\createdfiles\\fileinput.txt";
			FileInputStream fis = new FileInputStream(file);
			// this file return int value
			// have to be converted in the char to see the value.
			System.out.println(fis.read());
			int i = fis.read();
			// it will show the value in character....
			System.out.println((char) i);
			// after read is completed close the file as well.
			fis.close();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}
}
