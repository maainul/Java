package _9_NIO_2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class _4_WriteIntoFiles {

	public static void main(String[] args) {
		try {
			Path path = Paths.get("mainulTest/newTest.txt");
			Path donePath = Files.createFile(path);
			
			String string = "This is next big things";
			
			Files.write(donePath, string.getBytes());
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
