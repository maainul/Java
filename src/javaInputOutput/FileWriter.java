package javaInputOutput;

public class FileWriter {

	public static void main(String[] args) {
		try {
			java.io.FileWriter fwriter = new java.io.FileWriter("D:\\testout.txt");
			fwriter.write(" I love again");
			fwriter.close();
			System.out.println("Sucess");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		

	}

}
