package _9_NIO_2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class _1_CreateDirectory {
	public static void main(String[] args) {
		try {
			Path path = Paths.get("mainulTest");
			if (Files.exists(path)) {
				System.out.println("Already exists");
			}else {
				Path newPath = Files.createDirectories(path);
				System.out.println("Directory creatred "+ newPath.toString());
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
