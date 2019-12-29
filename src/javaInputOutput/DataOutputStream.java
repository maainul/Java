package javaInputOutput;

import java.io.FileOutputStream;
import java.io.IOException;
// use to write premitive data 
// java application genetally uses the data output stream to write data that can letter be read by a data input stream...

public class DataOutputStream {
   public static void main(String[] args) throws IOException {
     try {
    	 // write a file named test.txt
		FileOutputStream fos = new FileOutputStream("D:\\test.txt");
		// extends the dataoutput stream to write data
		java.io.DataOutputStream data = new java.io.DataOutputStream(fos);
		//String string = "i am a boy.";
		//byte[] b= string.getBytes();
		// write data to the file 
 		data.write(65);
 		data.close();
 		System.out.println("Success....");
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
   }
}