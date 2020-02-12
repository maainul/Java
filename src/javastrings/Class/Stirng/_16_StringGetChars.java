package javastrings.Class.Stirng;
//  The java string getChars() method copies characters from the 
//  given string into the destination character array.
public class _16_StringGetChars {

	public static void main(String[] args) {
		String string = new String("Hello javaworld");
		char[] ch = new char[10];
		try {
			string.getChars(6, 15, ch, 0);
			//string.getChars(source char begins, source char end, destination name, destination begins);
			System.out.println(ch);
		} catch (Exception ex) {
			System.out.println(ex);
		}

	}

}
// javaworld