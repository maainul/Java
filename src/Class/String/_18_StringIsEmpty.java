package Class.String;

// The java string isEmpty() method checks if this string is empty or not. 
// It returns true, if length of string is 0 otherwise false. 
// In other words, true is returned if string is empty otherwise it returns false.

public class _18_StringIsEmpty {

	public static void main(String[] args) {
		String s1 = "";
		String s2 = "Javaworld";
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
		if (s1.length() == 0 || s1.isEmpty()) {
			// s1 is empty
			// OR operation
			// je kono ekta true holei true (0, 1 = 1) (0 0 = 0),(1,1 = 1)
			System.out.println("String s1 is empty...");
		} else {
			System.out.println(s1);
		}
		if (s2.length() == 0 || s2.isEmpty()) {
			System.out.println("S2 is empty..");
		} else {
			System.out.println(s2);
		}
	}

}
/*
 * true false String s1 is empty... Javaworld
 */