package javaInputOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterClass {
	public static void main(String args[]) {
		try {
			FileWriter writer = new FileWriter("D:\\testout.txt");
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			bufferedWriter.write("i am not quick");
			bufferedWriter.close();
			System.out.println("success");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		
	}
}
