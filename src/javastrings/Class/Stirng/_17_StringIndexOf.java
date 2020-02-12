package javastrings.Class.Stirng;

public class _17_StringIndexOf {

	public static void main(String[] args) {
		String s1 = "I am from Bangladesh.";
		System.out.println(s1.indexOf("from")); // 5
		System.out.println(s1.indexOf('I')); //0
		System.out.println(s1.indexOf("Ban")); // 10
		
		
		 String s11 = "This is indexOf method";         
	        // Passing char and index from  
		 	// This method takes char and index as arguments and returns index of first character occured after the given fromIndex. 
	        int index = s11.indexOf('e', 12); //Returns the index of this char  
	        System.out.println("index of char "+index);       

	}

}
