package _8_io;

import java.io.File;
// Page no - 408
public class _1_FileSample {

	public static void main(String[] args) {
		File file = new File("/home/mainul/data/zoo.txt");
		System.out.println(file.exists());
	}
}
// OutPut -False
// Because File won't create File it create only object.

