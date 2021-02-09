package javaInputOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadingdatafromconsolebyInputStreamReaderandBufferedReader {

	public static void main(String[] args) throws Exception {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		System.out.println("Enter our name");
		String nameString = br.readLine();
		System.out.println("Welcome :" + nameString);

	}

}
