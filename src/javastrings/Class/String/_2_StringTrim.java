package javastrings.Class.String;
//The string trim() method eliminates white spaces before and after string.
public class _2_StringTrim {

	public static void main(String[] args) {
		
		String s1="  hello string   "; 
		
		System.out.println(s1); // without trim method
		System.out.println(s1.trim()); //with trim method
		
		System.out.println(s1+"javatpoint");//without trim()  string concat
		
		System.out.println(s1.trim()+"javatpoint");//with trim()  
		
		
	}

}
