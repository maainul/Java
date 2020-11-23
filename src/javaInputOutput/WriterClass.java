package javaInputOutput;

import java.io.FileWriter;
import java.io.Writer;

public class WriterClass {

	public static void main(String[] args) {
		try {
			Writer w = new FileWriter("D:\\Output.txt");
			String contenString = " Be patient.";
			w.write(contenString);
			w.close();
			System.out.println("Done");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
