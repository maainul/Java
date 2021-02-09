package javaInputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class ReadsTheDataFromTwoFilesAndWritesIntoAnotherFile {

	public static void main(String[] args) {
		try {
			String file = "C:\\Users\\Md.Mainul hasan anik\\gitrepo\\Java\\src\\javaInputOutput\\createdfiles\\fileinput.txt";
			FileInputStream input1 = new FileInputStream(file);
			FileInputStream input2 = new FileInputStream("D:\\New Text Document.txt");
			FileOutputStream fos = new FileOutputStream(
					"C:\\Users\\Md.Mainul hasan anik\\gitrepo\\Java\\src\\javaInputOutput\\createdfiles\\testadd.txt");
			SequenceInputStream sis = new SequenceInputStream(input1, input2);

			int i;
			while ((i = sis.read()) != -1) {
				// System.out.print((char)i);
				fos.write(i);
			}

			sis.close();
			fos.close();
			input1.close();
			input2.close();
			System.out.println("Success...");

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
