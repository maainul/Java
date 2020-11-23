package javaInputOutput;

import java.io.FileInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class ReadsTheDataFromMoreThenTwoFiles {
	public static void main(String args[]) {
		try {
			String file1 = "D:\\a.txt";
			String file2 = "D:\\b.txt";
			String file3 = "D:\\c.txt";
			String file4 = "D:\\d.txt";
			
			FileInputStream fil1 = new FileInputStream(file1);
			FileInputStream fil2 = new FileInputStream(file2);
			FileInputStream fil3 = new FileInputStream(file3);
			FileInputStream fil4 = new FileInputStream(file4);
			
			Vector<FileInputStream> v = new Vector<FileInputStream>();
			v.add(fil1);
			v.add(fil2);
			v.add(fil3);
			v.add(fil4);
			Enumeration<FileInputStream> e = v.elements();
			
			SequenceInputStream sis = new SequenceInputStream(e);
			int i;
			while((i=sis.read()) != -1) {
				System.out.print((char)i);
				//sis.write(i);
			}
			sis.close();
			fil1.close();
			fil2.close();
			fil3.close();
			fil4.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
