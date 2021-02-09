package javaInputOutput;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutputStreamExample {

	public static void main(String[] args) {
		try {
			FileOutputStream fout1 = new FileOutputStream("D:\\ab.txt");
			FileOutputStream fout2 = new FileOutputStream("D:\\bb.txt");

			ByteArrayOutputStream bout = new ByteArrayOutputStream();
			bout.write(65);
			bout.writeTo(fout1);
			bout.writeTo(fout2);

			bout.flush();
			bout.close();
			System.out.println("success");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
