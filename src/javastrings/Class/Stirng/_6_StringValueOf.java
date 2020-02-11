package javastrings.Class.Stirng;
// The string valueOf() method coverts given type such as int, 
// long, float, double, boolean, char and char array into string.
  
public class _6_StringValueOf {

	public static void main(String[] args) {
		int value = 30;
		String s1 = String.valueOf(value);
		System.out.println(s1+10);
		char ch1 = 'A';    
	    char ch2 = 'B';  
	    String s = String.valueOf(ch1);    
	    String s2 = String.valueOf(ch2);  
	    System.out.println(s);  
        System.out.println(s2); 
	}

}
/*
3010
A
B
*/