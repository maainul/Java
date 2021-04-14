package _9_NIO_2;

import java.util.List;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.UserPrincipal;
import java.util.Iterator;

public class _1_BasicMethods {

	public static void main(String[] args) throws URISyntaxException{
		// Create a Path object
		Path path1 = Paths.get("/code/java");
		System.out.println(path1);

		// Create a Path object second mehod
		Path path2 = FileSystems.getDefault().getPath("code/java");
		
		//Or
	//	FileSystem fileSystem = FileSystems.getFileSystem(new URI("www.onk.com"));
	//	Path path3 = fileSystem.getPath("test.png");
		
		// Working with legacy file
		File file = new File("pandas/cuddly.png");
		Path path = file.toPath();
		
		// File
		Path path4 = Paths.get("cuddly.jpg");
		File file2 = path4.toFile();
		
		// viewing the path
		Path path5 = Paths.get("/mainul/anik/test.txt");
		System.out.println("The Path Name is = _"+path5);
		
		for(int i = 0; i < path5.getNameCount(); i++) {
			System.out.println(path5.getName(i));
		}
		
		System.out.println("File name is = "+path5.getFileName());
		System.out.println("Root is = "+ path5.getRoot());
		
		Path currentPath = path5;
		while((currentPath = currentPath.getParent()) != null) {
			System.out.println("Current Parent is = "+currentPath);
		}
		// checking path type 
		Path path3 = Paths.get("/birds/condor.txt");
		System.out.println("Path is Absolute = "+path3.isAbsolute());
		System.out.println("Absolute path3 = "+ path3.toAbsolutePath());
		
		// Creating subpath
		Path path6  = Paths.get("/mammal/carnivore/racoon.image");
		System.out.println(path6);
		System.out.println("Subpath form o and 3 = "+ path6.subpath(0, 3));
		System.out.println("Subpath form o and 3 = "+ path6.subpath(2, 3));
		System.out.println("Subpath form o and 3 = "+ path6.subpath(1, 2));
		
		
		
		try {
			System.out.println(Files.isSameFile(path6, path2));
			System.out.println(Files.isSameFile(path6, path3));
			System.out.println(Files.isSameFile(path, path4));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try {
			Files.createDirectory(Paths.get("/bison/field"));
			Files.createDirectories(Paths.get("Desktop/new2/anik"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// copy
		try {
			Files.copy(path6, path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		 * try { //Files.deleteIfExists(Paths.get("new2/anik/maiu.txt")); } catch
		 * (IOException e) { // TODO Auto-generated catch block e.printStackTrace(); }
		 */
		Path path7 = Paths.get("/home/onik/java_error_in_idea_6463.log");
		try {
			List<String> linesList = Files.readAllLines(path7);
			for(String string : linesList) {
				System.out.println(string);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println(Files.isHidden(path7));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			System.out.println(Files.size(path7));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Files.isReadable(path7));
		System.out.println(Files.isExecutable(path7));
		
		
		try {
			System.out.println(Files.getLastModifiedTime(path7).toMillis());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println(Files.getOwner(path7));
			UserPrincipal ownerPrincipal = path7.getFileSystem().getUserPrincipalLookupService().lookupPrincipalByName("new");
			Files.setOwner(path7, ownerPrincipal);
			System.out.println(Files.getOwner(path7).getName());	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
