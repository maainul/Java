package javaInputOutput;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamClass {

	public static void main(String[] args) {
		try {
			String file = "C:\\Users\\Md.Mainul hasan anik\\gitrepo\\Java\\src\\javaInputOutput\\createdfiles\\fileoutputbuffer.txt";
			FileOutputStream fos = new FileOutputStream(file);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			String string = "welcome again";
			byte b[] = string.getBytes();
			bos.write(b);
			//fos.write(b);
			bos.flush();
			//fos.close();
			bos.close();
			System.out.println("successfull.");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
