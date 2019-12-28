package javaInputOutput;

import java.io.FileOutputStream;

public class JavaFileOutputStreamExample2writeString {

	public static void main(String[] args) {
		try {
			String file = "C:\\Users\\Md.Mainul hasan anik\\gitrepo\\Java\\src\\javaInputOutput\\createdfiles\\file2.txt";
			FileOutputStream foStream = new FileOutputStream(file);
			String string = "Welcome to my world";
			byte b[] = string.getBytes(); // converting string into byte code..
			foStream.write(b);
			foStream.close();
			System.out.println("Successfull..");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
