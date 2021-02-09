package javaInputOutput;

import java.io.FileOutputStream;
import java.io.IOException;

public class FilterOutputStream {

	public static void main(String[] args) throws IOException {
		FileOutputStream fis = new FileOutputStream("D:\\test.txt");
		java.io.FilterOutputStream fos = new java.io.FilterOutputStream(fis);

		String string = "Welcome jess..";
		byte b[] = string.getBytes();
		fos.write(b);
		fos.flush();
		fos.close();
		fis.close();
		System.out.println("Success");
	}

}
