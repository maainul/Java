package _9_NIO_2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class _2_CreateFileInDirectory {

	public static void main(String[] args) {
		try {
			Path path = Paths.get("mainulTest/poem.txt");
			if (Files.exists(path)) {
				
				System.out.println("Path Already created");
			}
			else {
				Files.createFile(path);
				System.out.println("Path created");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
