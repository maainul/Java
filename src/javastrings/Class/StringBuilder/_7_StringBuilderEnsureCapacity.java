package javastrings.Class.StringBuilder;

public class _7_StringBuilderEnsureCapacity
{
	public static void main(String[] args) {
	
	    StringBuilder sb = new StringBuilder("Hello");
	   
		System.out.println(sb.capacity());
		
		sb.append(" Java is my favourite language.");
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.ensureCapacity(50);
		System.out.println(sb.capacity());
		
	}
}

/*
Output:
21                                                            
Hello Java is my favourite language.                          
44                                                            
90
*/
