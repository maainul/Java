package _6_ExceptionsAndAssertions;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class Test {

	public static void main(String[] args) throws IOException {
		System.out.println(new Date());
		File sourceFile = new File("zoo.txt");
		File destinationFile = new File("zooCopy.txt");
		copy(sourceFile,destinationFile);
		
		
		
		
		
		
	}

	private static void copy(File sourceFile, File destinationFile) throws IOException {
		try(BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(sourceFile));
				BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(destinationFile)))
		{
			int b;
			byte[] buffer  = new byte[1024];
			
			while((b = inputStream.read(buffer)) != -1) {
				outputStream.write(buffer);
				outputStream.flush();
			}
	}
}
}
