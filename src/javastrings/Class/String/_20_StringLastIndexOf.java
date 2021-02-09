package javastrings.Class.String;

// The java string lastIndexOf() method returns last index of the given character value or substring. 
// If it is not found, it returns -1. The index counter starts from zero.
public class _20_StringLastIndexOf {
	public static void main(String args[]) {
		String s4 = "This is index of lastindex.";
		System.out.println(s4.lastIndexOf('s'));
		System.out.println(s4.lastIndexOf('s', 5));
	}
}
