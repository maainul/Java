package _9_NIO_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class _1_CreateDirectory {
	public static void main(String[] args) {
		
			Path path = Paths.get("mainulTest");
			
			if (Files.exists(path)) {
				System.out.println("Already exists");
			}else {
				
				try {
					Files.createDirectories(path);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Directory creatred "+ path.toString());
			}
		
	}
}
