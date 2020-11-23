package javaInputOutput;
import java.security.PermissionCollection;
//import java.io.FilePermission;
import java.io.IOException;

public class FilePermission {

	public static void main(String[] args) throws IOException {
		String string= "D:\\IO Package\\java.txt";
		java.io.FilePermission file1 = new java.io.FilePermission("D:\\IO Package\\-", "read");
		PermissionCollection permission = file1.newPermissionCollection();
		permission.add(file1);
		java.io.FilePermission file2 = new java.io.FilePermission(string, "write");
		permission.add(file2);
		 if(permission.implies(new java.io.FilePermission(string, "read,write"))) {
			 System.out.println("Read, Write permission is granted for the path "+string );  
         }else {  
        System.out.println("No Read, Write permission is granted for the path "+string);            }  
   
		

	}

}
