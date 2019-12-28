package javaInputOutput;

import java.io.FileOutputStream;

public class FileOutputStreamExample1writebyte {
    public static void main(String args[]){    
        try{    
          FileOutputStream fout=new FileOutputStream("C:\\Users\\Md.Mainul hasan anik\\gitrepo\\Java\\src\\javaInputOutput\\createdfiles\\file.txt");    
          fout.write(65);   
          fout.write(112);
          fout.close();    
          System.out.println("success...");    
         }catch(Exception e){System.out.println(e);}    
   }
}
