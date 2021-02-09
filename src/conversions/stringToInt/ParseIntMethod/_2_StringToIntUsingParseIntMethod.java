/**********************************************
Method 1: Use Integer.parseInt() method

This is the most simple method to convert String to integer. 
This function parses the string argument as a signed decimal integer.
 */

package conversions.stringToInt.ParseIntMethod;

//Java program to convert String to int 
//using Integer.parseInt() method 
public class _2_StringToIntUsingParseIntMethod {

	public static void main(String[] args) {
		String string = "2qw";
		System.out.println("String :" + string);

		System.out.println(convert(string));

	}

	private static int convert(String string) {
		int i = 0;
		// Convert the String
		try {
			i = Integer.parseInt(string);
		} catch (NumberFormatException e) {
			// This is thrown when the String
			// contains characters other than digits
			System.out.println("Invalid String.");
		}
		return i;
	}
}
