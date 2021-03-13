package Class.String;

// The java string toCharArray() method converts this string into character array. 
// It returns a newly created character array, 
// its length is similar to this string and its contents are initialized with the characters of this string.

public class _24_StringToCharArray {

	public static void main(String[] args) {
		String s1 = "hello";

		char[] ch = s1.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		String s2 = "Welcome to the java world";

		char[] ch2 = s2.toCharArray();

		int len = ch2.length;

		System.out.println("Length of array :" + len);
		for (int i = 0; i < ch2.length; i++) {
			System.out.println(ch2[i]);
		}
	}
}
