/************************************************************************
 
Java Convert String to int

We can convert String to an int in java using Integer.
	1.Integer.parseInt()
	2.Integer.valueOf() 


	It is generally used if we have to perform mathematical operations 
	on the string which contains a number. 
	Whenever we receive data from TextField or TextArea, 
	entered data is received as a string. 
	If entered data is in number format, 
	we need to convert the string to an int. 
	To do so, we use Integer.parseInt() method.

*************************************************************************/
package conversions.stringToInt.ParseIntMethod;

public class _1_StringToIntUsingParseIntMethod {

	public static void main(String[] args) {
		String string = "200";

		int i = Integer.parseInt(string);
		System.out.println(i);

	}

}
