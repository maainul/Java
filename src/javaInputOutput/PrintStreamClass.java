package javaInputOutput;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamClass {

	public static void main(String[] args) throws Exception{
		FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
		PrintStream pout = new PrintStream(fout);
		
		pout.println(2016);
		pout.println("Hello java");
		pout.close();
		pout.close();
		
		System.out.println("Success...");
	
	}
}
