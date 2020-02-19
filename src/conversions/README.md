# Java Conversions

[1. Java String to int](https://www.javatpoint.com/java-string-to-int)</br>
[2. Java int to String](https://www.javatpoint.com/java-int-to-string)</br> 
[3. Java String to long](https://www.javatpoint.com/java-string-to-long)</br>
[4. Java long to String](https://www.javatpoint.com/java-long-to-string)</br>
[5. Java String to float](https://www.javatpoint.com/java-string-to-float)</br>
[6. Java float to String](https://www.javatpoint.com/java-float-to-string)</br>
[7. Java String to double](https://www.javatpoint.com/java-string-to-double)</br>
[8. Java double to String](https://www.javatpoint.com/java-double-to-string)</br>
[10. Java Date to String](https://www.javatpoint.com/java-string-to-date)</br>
11. Java String to char
12. Java char to String
13. Java String to Object
14. Java Object to String
15. Java int to longJ
16. ava long to int
17. Java int to double
18. Java double to int
19. Java char to int
20. Java int to char
21. Java String to boolean
22. Java boolean to String
23. Date to Timestamp
24. Timestamp to Date
25. Binary to Decimal
26. Decimal to Binary
27. Hex to Decimal
28. Decimal to Hex
29. Octal to Decimal
30. Decimal to Octal

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
/************************************************************************
Method 1: Use Integer.parseInt() method

This is the most simple method to convert String to integer. 
This function parses the string argument as a signed decimal integer.
 ***********************************************************************/

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
## Example 4 : String to Int (Using ValueOf Method):
```.java
package conversions.stringToInt.ValueOfMethod;

public class _1_StringToIntUsingValueOfMethod {

	public static void main(String[] args) {
		String string = "230";
		System.out.println("String :"+string);
		int i = 0;
		try {
			i = Integer.valueOf(string);
			System.out.println("Int value :"+i);
		} catch (NumberFormatException e) {
			System.out.println("Invalid Number.");
		}
		System.out.println("Concatenation of string :"+string+10); // not posssible,string
		System.out.println("Contatenation of int :"+i+10);

	}

}
/*
String :230
Int value :230
Concatenation of string :23010
Contatenation of int :23010
*/
```
# 2. Java int to String
```
We can convert int to String in java using 
		1. String.valueOf() and 
		2. Integer.toString() methods. Alternatively, we can use 
		3. String.format() method, string concatenation operator etc.
```
```
It is generally used if we have to display number in textfield 
because everything is displayed as a string in form.
```
## 2.1) String.valueOf()
```
The String.valueOf() method converts int to String. 
The valueOf() is the static method of String class. 
```
```
The signature of valueOf() method is given below: public static String valueOf(int i)  
```
```.java
Let's see the simple code to convert int to String in java.

int i=10;  
String s=String.valueOf(i);//Now it will return "10"  
Let's see the simple example of converting String to int in java.

public class IntToStringExample1{  
	public static void main(String args[]){  
	int i=200;  
	String s=String.valueOf(i);  
	System.out.println(i+100);//300 because + is binary plus operator  
	System.out.println(s+100);//200100 because + is string concatenation operator  
	}
}  

Output:

300
200100
```
## 2.2) Integer.toString()
```
The Integer.toString() method converts int to String. 
The toString() is the static method of Integer class. 
```
```
The signature of toString() method is given below: public static String toString(int i)  
```
```.java
Let's see the simple code to convert int to String in java using Integer.toString() method.

int i=10;  
String s=Integer.toString(i);//Now it will return "10"  
Let's see the simple example of converting String to int in java.

public class IntToStringExample2{  
	public static void main(String args[]){  
	int i=200;  
	String s=Integer.toString(i);  
	System.out.println(i+100);//300 because + is binary plus operator  
	System.out.println(s+100);//200100 because + is string concatenation operator  
	}
}  

Output:

300
200100
```

# 2.3) String.format()
```
The String.format() method is used to format given arguments into String. It is introduced since Jdk 1.5.
```
```
public static String format(String format, Object... args)  
```
```.java
Let's see the simple code to convert int to String in java using String.format() method.

public class IntToStringExample3{  
	public static void main(String args[]){  
	int i=200;  
	String s=String.format("%d",i);  
	System.out.println(s);  
	}
}  

Output:

200                     
```
# 3. Java String to long
```

```
# 4. Java long to String
```

```
# 5. Java String to float
```

```
# 6. Java float to String
```

```
# 7. Java String to double
```

```
# 8. Java double to String
```


```
# 9. Java String to Date
```

```
# 10. Java Date to String
```

```
# 11. Java String to char
# 12. Java char to String
# 13. Java String to Object
# 14. Java Object to String
# 15. Java int to longJ
# 17. Java int to double
# 18. Java double to int
# 19. Java char to int
# 20. Java int to char
# 21. Java String to boolean
# 22. Java boolean to String
# 23. Date to Timestamp
# 24. Timestamp to Date
# 25. Binary to Decimal
# 26. Decimal to Binary
# 27. Hex to Decimal
# 28. Decimal to Hex
# 29. Octal to Decimal
# 30. Decimal to Octal