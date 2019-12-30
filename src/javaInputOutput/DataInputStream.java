package javaInputOutput;

import java.io.FileInputStream;

public class DataInputStream {
    public static void main(String args[]){    
        try{    
          FileInputStream fout=new FileInputStream("C:\\Users\\Md.Mainul hasan anik\\gitrepo\\Java\\src\\javaInputOutput\\createdfiles\\file2.txt");    
          java.io.DataInputStream dis = new java.io.DataInputStream(fout);

          //dis.close();    
          int count = fout.available();  
          byte[] ary = new byte[count];  
          dis.read(ary);  
          for (byte bt : ary) {  
            char k = (char) bt;  
            System.out.print(k+"-");  
          } 
          dis.close();
         }catch(Exception e){System.out.println(e);}    
   } 
}
