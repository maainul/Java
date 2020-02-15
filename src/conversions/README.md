# Java Conversions

# 1. Java Convert String to int
```
We can convert String to an int in java using Integer.
	1.Integer.parseInt()
	2.Integer.valueOf() 
```
```

	It is generally used if we have to perform mathematical operations 
	on the string which contains a number. 
	Whenever we receive data from TextField or TextArea, 
	entered data is received as a string. 
	If entered data is in number format, 
	we need to convert the string to an int. 
	To do so, we use Integer.parseInt() method.
```
## Example 1: String to Int (Using parseInt())
```.java
package conversions.stringToInt;

public class _1_StringToInt {

	public static void main(String[] args) {
		String string = "200";
		
		int i = Integer.parseInt(string);
		System.out.println(i);

	}

}
Output : 200
```
## Example 2: String to Int( Using parseInt)
```.java
/**********************************************
Method 1: Use Integer.parseInt() method

This is the most simple method to convert String to integer. 
This function parses the string argument as a signed decimal integer.
 */

package conversions.stringToInt;
//Java program to convert String to int 
//using Integer.parseInt() method 
public class _2_StringToIntUsingParseIntMethod {

	public static void main(String[] args) {
		String string = "2qw";
		System.out.println("String :"+string);
		
		System.out.println(convert(string));

	}

	private static int convert(String string) {
		int i = 0;
		 // Convert the String 
		try {
			 i  = Integer.parseInt(string);
		} 
		catch (NumberFormatException e) {
			// This is thrown when the String 
            // contains characters other than digits 
			System.out.println("Invalid String.");
		}
		return i;
	}
}
 
 
// This is thrown when the String 
// contains characters other than digits

Output : Invalid
```
## Example 3: String to Int (Using parseInt) concatenations: 
```.java
package conversions.stringToInt.ParseIntMethod;

public class _3_StringToIntegerUsingParseIntMethodAndConcatenation {
public static void main(String agr[]) {
	String string = "200";
	
	int i = Integer.parseInt(string);
	
	System.out.println(string + 200);//200100, because "200"+100, here + is a string concatenation operator  
	System.out.println(i+100);//300, because 200+100, here + is a
	}
}
```