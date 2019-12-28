package javaInputOutput;

import java.io.FileInputStream;


public class JavaFileInputStreamExample2readAllCharacters {

	public static void main(String[] args) {
		String file = "C:\\Users\\Md.Mainul hasan anik\\gitrepo\\Java\\src\\javaInputOutput\\createdfiles\\fileinput.txt";
		try {
			FileInputStream fin =  new FileInputStream(file);
			 int i=0;    
	            while((i=fin.read())!=-1){    
	             System.out.print((char)i);    
	            }    
	            fin.close();    
	          }catch(Exception e){System.out.println(e);}    
	         }    
	        }  