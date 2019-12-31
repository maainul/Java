package javaInputOutput;

import java.io.File;
import java.io.PrintWriter;

public class PrintWriterExample {

	public static void main(String[] args) throws Exception{
		PrintWriter writer = new PrintWriter(System.out);
		
		writer.write("java java jaaa");
		writer.flush();
		writer.close();
		
		PrintWriter writer1 = null;
		
		writer1 = new PrintWriter(new File("D:\\testout22.txt"));
		writer1.write("like like java");
		writer1.flush();
		

	}

}
