/*
The java string substring() method returns a part of the string.

We pass begin index and end index number position in the java 
substring method where start index is inclusive and end index is exclusive. 
In other words, start index starts from 0 whereas end index starts from 1.

There are two types of substring methods in java string.
*/
package javastrings.Class.String;

public class _23_StringSubstring {

	public static void main(String[] args) {
		
		String s1 = "javatpoint";
		System.out.println(s1.substring(2,4));
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(0,5));

	}

}
