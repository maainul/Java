package _9_NIO_2;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class _3_ReadDataFromFile {

	public static void main(String[] args) {
		try {
			Path path = Paths.get("mainulTest/poem.txt");
			
			List<String> stringsList = Files.readAllLines(path);
			
			for(String string : stringsList) {
				System.out.println(string);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
