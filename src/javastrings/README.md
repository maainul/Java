# Chapter 1.Java String
```
In Java, string is basically an object that represents sequence of char values. 

An array of characters works same as Java string. For example:
```
```.java
char[] ch={'j','a','v','a','t','p','o','i','n','t'};  
String s=new String(ch);  

is same as:

String s="javatpoint";
```
## The java.lang.String class implements Serializable, Comparable and CharSequence interfaces.
![string_catagory](https://user-images.githubusercontent.com/37740006/74242984-13c5dc80-4d09-11ea-8e07-e567620cd803.png)

# CharSequence Interface
![charstring](https://user-images.githubusercontent.com/37740006/74243383-ddd52800-4d09-11ea-8b37-bb99b34b0523.png)
```
The CharSequence interface is used to represent the sequence of characters. 
  1. String, 
  2. StringBuffer and 
  3. StringBuilder classes implement it. 
It means, we can create strings in java by using these three classes.
```

# CharSequence in Java
```
The Java String is immutable which means it cannot be changed. 
Whenever we change any string, a new instance is created. 
```
# For mutable strings, you can use StringBuffer and StringBuilder classes.
# What is String in java
```
Generally, String is a sequence of characters. 
But in Java, string is an object that represents a sequence of characters. 
The java.lang.String class is used to create a string object.
```
# How to create a string object?
```
There are two ways to create String object
  1. By string literal
  2. By new keyword
```
# 1) String Literal
```.java
Java String literal is created by using double quotes. For Example:

String s="welcome";  
```
```
Each time you create a string literal, 
the JVM checks the "string constant pool" first. 
If the string already exists in the pool, 
a reference to the pooled instance is returned. 
If the string doesn't exist in the pool, 

a new string instance is created and placed in the pool. 
For example:
```
```.java
String s1="Welcome";  
String s2="Welcome";//It doesn't create a new instance  
```
![stringpool](https://user-images.githubusercontent.com/37740006/74243959-deba8980-4d0a-11ea-9990-9ab6f276ccfe.png)
```
In the above example, only one object will be created. 
Firstly, JVM will not find any string object with the value "Welcome" in string constant pool, 
that is why it will create a new object. 
After that it will find the string with the value "Welcome" in the pool, 
it will not create a new object but will return the reference to the same instance.
```
# 2) By new keyword
```
String s=new String("Welcome");//creates two objects and one reference variable  

In such case, JVM will create a new string object in normal (non-pool) heap memory, 
and the literal "Welcome" will be placed in the string constant pool. 
The variable s will refer to the object in a heap (non-pool).
```
# Java String Example
```.java
public class StringExample{  
  public static void main(String args[]){  
    String s1="java";//creating string by java string literal  
    char ch[]={'s','t','r','i','n','g','s'};  
    String s2=new String(ch);//converting char array to string  
    String s3=new String("example");//creating java string by new keyword  
    System.out.println(s1);  
    System.out.println(s2);  
    System.out.println(s3);  
  }
}


java
strings
example
```
# Chaptr 2.Immutable String in Java
```
In java, string objects are immutable. 
Immutable simply means unmodifiable or unchangeable.

Once string object is created its data or state can't be changed but a new string object is created.

Let's try to understand the immutability concept by the example given below:
```
```.java
class Testimmutablestring{  
 public static void main(String args[]){  
   String s="Sachin";  
   s.concat(" Tendulkar");//concat() method appends the string at the end  
   System.out.println(s);//will print Sachin because strings are immutable objects  
 }  
}  

Output:Sachin
```
```
Now it can be understood by the diagram given below. 
Here Sachin is not changed but a new object is created with sachintendulkar. 
That is why string is known as immutable.
```
# Heap diagram
![immutablestring](https://user-images.githubusercontent.com/37740006/74245278-f135c280-4d0c-11ea-9e3c-c49666889a29.png)
```
As you can see in the above figure that two objects are created but 
reference variable still refers to "Sachin" not to "Sachin Tendulkar".

But if we explicitely assign it to the reference variable, 
it will refer to "Sachin Tendulkar" object.For example:
```
```.java
class Testimmutablestring1{  
 public static void main(String args[]){  
   String s="Sachin";  
   s=s.concat(" Tendulkar");  
   System.out.println(s);  
 }  
}  
Test it Now
Output:Sachin Tendulkar
```
```
In such case, s points to the "Sachin Tendulkar". Please notice that still sachin object is not modified.
```
# Why string objects are immutable in java?
```
Because java uses the concept of string literal.
Suppose there are 5 reference variables,
all referes to one object "sachin".
If one reference variable changes the value of the object, 
it will be affected to all the reference variables. 
That is why string objects are immutable in java.
```
# Chapter 3 : Java String compare
```
We can compare string in java on the basis of content and reference.

There are three ways to compare string in java:

  1. By equals() method
  2. By = = operator
  3. By compareTo() method
```
# 1) String compare by equals() method

```.java
class Teststringcomparison1{  
 public static void main(String args[]){  
   String s1="Sachin";  
   String s2="Sachin";  
   String s3=new String("Sachin");  
   String s4="Saurav";  
   System.out.println(s1.equals(s2));//true  
   System.out.println(s1.equals(s3));//true  
   System.out.println(s1.equals(s4));//false  
 }  
}  

Output:true
       true
       false
       
```
```.java
class Teststringcomparison2{  
 public static void main(String args[]){  
   String s1="Sachin";  
   String s2="SACHIN";  
  
   System.out.println(s1.equals(s2));//false  
   System.out.println(s1.equalsIgnoreCase(s2));//true  
 }  
}  

Output:
  false
  true

```
# 2) String compare by == operator
```
The = = operator compares references not values.
```
```.java
class Teststringcomparison3{  
 public static void main(String args[]){  
   String s1="Sachin";  
   String s2="Sachin";  
   String s3=new String("Sachin");  
   System.out.println(s1==s2);//true (because both refer to same instance)  
   System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)  
 }  
}  
Output:true
       false
```
# 3) String compare by compareTo() method
```
The String compareTo() method compares values lexicographically and returns an 
integer value that describes if first string is less than, equal to or greater than second string.

Suppose s1 and s2 are two string variables. If:

s1 == s2 :0
s1 > s2   :positive value
s1 < s2   :negative value
```

```.java
class Teststringcomparison4{  
 public static void main(String args[]){  
   String s1="Sachin";  
   String s2="Sachin";  
   String s3="Ratan";  
   System.out.println(s1.compareTo(s2));//0  
   System.out.println(s1.compareTo(s3));//1(because s1>s3)  
   System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )  
 }  
}  

Output:0
       1
       -1
```

# Chapter 4 : String Concatenation in Java
```
In java, string concatenation forms a new string that is the combination of multiple strings.
There are two ways to concat string in java:

  1. By + (string concatenation) operator
  2. By concat() method
  
```
# 1) String Concatenation by + (string concatenation) operator

```.java
Java string concatenation operator (+) is used to add strings. For Example:

class TestStringConcatenation1{  
 public static void main(String args[]){  
   String s="Sachin"+" Tendulkar";  
   System.out.println(s);//Sachin Tendulkar  
 }  
}  

Output:Sachin Tendulkar
```
```
The Java compiler transforms above code to this:

String s=(new StringBuilder()).append("Sachin").append(" Tendulkar).toString();  
In java, String concatenation is implemented through the StringBuilder (or StringBuffer) 
class and its append method. String concatenation operator produces 
a new string by appending the second operand onto the end of the first operand. 
The string concatenation operator can concat not only string but primitive values also. 
For Example:
```
```.java
class TestStringConcatenation2{  
 public static void main(String args[]){  
   String s=50+30+"Sachin"+40+40;  
   System.out.println(s);//80Sachin4040  
 }  
}  


80Sachin4040

Note: After a string literal, all the + will be treated as string concatenation operator.
```
# 2) String Concatenation by concat() method

```
The String concat() method concatenates the specified string to the end of current string. Syntax:

public String concat(String another)  
Let's see the example of String concat() method.
```
```.java
class TestStringConcatenation3{  
 public static void main(String args[]){  
   String s1="Sachin ";  
   String s2="Tendulkar";  
   String s3=s1.concat(s2);  
   System.out.println(s3);//Sachin Tendulkar  
  }  
}  

Sachin Tendulkar

```
# Chaptr 5 :Substring in Java
```
A part of string is called substring. 
In other words, substring is a subset of another string. 
In case of substring startIndex is inclusive and endIndex is exclusive.

Note: Index starts from 0.
You can get substring from the given string object by one of the two methods:
```
```
public String substring(int startIndex): This method returns new String object 
containing the substring of the given string from specified startIndex (inclusive).

public String substring(int startIndex, int endIndex): This method returns new String object
containing the substring of the given string from specified startIndex to endIndex.
```
```
In case of string:

startIndex: inclusive
endIndex: exclusive
```

### Let's understand the startIndex and endIndex by the code given below.
```
```.java
String s="hello";  
System.out.println(s.substring(0,2));//he  
In the above substring, 0 points to h but 2 points to e (because end index is exclusive).
```
```.java
Example of java substring
public class TestSubstring{  
 public static void main(String args[]){  
   String s="SachinTendulkar";  
   System.out.println(s.substring(6));//Tendulkar  
   System.out.println(s.substring(0,6));//Sachin  
 }  
}  
Test it Now
Tendulkar
Sachin
```
# Chapter 6 :Java String class methods
```
The java.lang.String class provides a lot of methods to work on string. 
By the help of these methods, we can perform operations on string such as 
trimming, concatenating, converting, comparing, replacing strings etc.

Java String is a powerful concept because everything is treated as a string 
if you submit any form in window based, web based or mobile application.

```
## Let's see the important methods of String class


1. String toUpperCase() and toLowerCase()</br>
2. String trim()</br>
3. String startsWith() and String endsWith()</br>
4. String charAt()</br>
5. String length()</br>
6. String valueOf()</br>
7. String intern()</br>
8. String replace()</br>
9. String compareTo()</br>
10. String concat()</br>
11. String contains()</br>
12. String equals()</br>
13. String equalsIgnoreCase()</br>
14. String format()</br>
15. String getBytes()</br>
16. String getChars()</br>
17. String indexOf()</br>
18. String isEmpty()</br>
19. String join()</br>
20. String lastIndexOf()</br>
21. String replaceAll()</br>
22. String split()
23. String substring()
24. String toCharArray()


# 1. Java String toUpperCase() and toLowerCase() method
```
The java string toUpperCase() method converts this string into 
uppercase letter and string toLowerCase() method into lowercase letter.
```
```.java
package javastrings.Class.Stirng;

public class _1_StringtoUpperCaseAndtoLowerCase {

	public static void main(String[] args) {
		String s1 = "Mainul";
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1);

	}

}
/*
MAINUL
mainul
Mainul
*/
```

# 2. Java String trim() method
```
The string trim() method eliminates white spaces before and after string.
```
```.java
package javastrings.Class.Stirng;
//The string trim() method eliminates white spaces before and after string.
public class _2_StringTrim {

	public static void main(String[] args) {
		
		String s1="  hello string   "; 
		
		System.out.println(s1); // without trim method
		System.out.println(s1.trim()); //with trim method
		
		System.out.println(s1+"javatpoint");//without trim()  string concat
		
		System.out.println(s1.trim()+"javatpoint");//with trim()  
		
		
	}

}

  hello string   
hello string
  hello string   javatpoint
hello stringjavatpoint

```
# 3. String startsWith() and String endsWith()

```.java

package javastrings.Class.Stirng;

public class _3_StringStartsAndEndWith {

	public static void main(String[] args) {
		String s1 = "Mainul";
		System.out.println(s1.startsWith("a")); //false
		System.out.println(s1.startsWith("m")); // case sensitive //false
		System.out.println(s1.startsWith("M")); //true
		System.out.println(s1.endsWith("l")); //true
		System.out.println(s1.endsWith("L")); //false
		
		if(s1.endsWith("ul")) {
			System.out.println("You know me");
		}
		else {
			System.out.println("You don't know me");
		}
	}

}
/*
false
false
true
true
false
You don't know me
*/
```
# 4. String charAt()
```
The string charAt() method returns a character at specified index.
```
```.java

package javastrings.Class.Stirng;

public class StringCharAt {

	public static void main(String[] args) {
		String s1 = "Mainul";
		System.out.println(s1.charAt(0)); // M
		System.out.println(s1.charAt(3)); // n
		// character with index number.. 
		for (int i = 0; i < s1.length(); i++) {
			System.out.println(s1.charAt(i));
		} // m a i n u l
		// character with condition
		System.out.println("Find odd number of Character:");
		for (int i = 0; i < s1.length(); i++) {
			if(i%2 != 0) {
				System.out.println(s1.charAt(i));	
			}
		} // a n l
		// count number of repeated character
		int count = 0;
		System.out.println("Count of Character:");
		for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i) == 'a') {
				System.out.println(s1.charAt(i));	
				count++;
			}
		} // a 1
		System.out.println(count); //1
		System.out.println(s1.length()); // 6

	}
}

M
n
M
a
i
n
u
l
Find odd number of Character:
a
n
l
Count of Character:
a
1
6
```
# 5. String length()</br>

```.java
package javastrings.Class.Stirng;

public class _5_StringLength {

	public static void main(String[] args) {
		String s1 = "javapoint";
		String s2 = "Python";
		System.out.println("String length :"+s1.length());
		System.out.println("string length :"+ s2.length());
		if(s1.length() > 0) {
			System.out.println("String is not empty...");
		}
		else {
			System.out.println("String is empty..");
		}
		s1 = "";
		if(s1.length()== 0) {
			System.out.println("string is empty...");
		}
	}
}

/*
 * String length :9 
 * string length :6 
 * String is not empty... 
 * string is empty...
 */
```
# 6. String valueOf()
```.java
// The string valueOf() method coverts given type such as 
// int, long, float, double, boolean, char and char array into string.

package javastrings.Class.Stirng;
// The string valueOf() method coverts given type such as int, 
// long, float, double, boolean, char and char array into string.
  
public class _6_StringValueOf {

	public static void main(String[] args) {
		int value = 30;
		String s1 = String.valueOf(value);
		System.out.println(s1+10);
		char ch1 = 'A';    
	    char ch2 = 'B';  
	    String s = String.valueOf(ch1);    
	    String s2 = String.valueOf(ch2);  
	    System.out.println(s);  
        System.out.println(s2); 
	}

}
/*
3010
A
B
*/
```
# 7. String intern()
```
String Interning is a method of storing only one copy of each distinct String Value, 
which must be immutable.
By applying String.intern() on a couple of strings will ensure that 
all strings having the same contents share the same memory. 
For example, if a name ‘Amy’ appears 100 times, 
by interning you ensure only one ‘Amy’ is actually allocated memory.
```
![intern](https://user-images.githubusercontent.com/37740006/74351866-e9941d80-4de1-11ea-9e03-b5ffae12a001.png)

```
This can be very useful to reduce the memory requirements of your program. 
But be aware that the cache is maintained by JVM in permanent memory pool 
which is usually limited in size compared to heap so you should not use 
intern if you don’t have too many duplicate values
```
```
intern() method : In Java, when we perform any operation using intern() method, 
it returns a canonical representation for the string object. 
A pool is managed by String class.

1. When the intern() method is executed then it checks whether 
	the String equals to this String Object is in the pool or not.
   
2. If it is available, then the string from the pool is returned. 
   Otherwise, 
   this String object is added to the pool and a reference to this String object is returned.

3. It follows that for any two strings s and t, s.intern() == t.intern() is true 
	if and only if s.equals(t) is true.
```
```
	*** It is advised to use equals(), not ==, to compare two strings. 
	    This is because == operator compares memory locations, 
	    while equals() method compares the content stored in two objects.
```

```.java
// Java program to illustrate  
// intern() method  
class GFG {  
    public static void main(String[] args)  
    {  
        // S1 refers to Object in the Heap Area  
        String s1 = new String("GFG"); // Line-1  
  
        // S2 refers to Object in SCP Area 
        String s2 = s1.intern(); // Line-2  
          
        // Comparing memory locations 
        // s1 is in Heap 
        // s2 is in SCP 
        System.out.println(s1 == s2); 
          
        // Comparing only values 
        System.out.println(s1.equals(s2)); 
          
        // S3 refers to Object in the SCP Area  
        String s3 = "GFG"; // Line-3  
  
        System.out.println(s2 == s3);  
    }  
}  

Output:

false
true
true
```


## Explanation :
``` 
Whenever we create a String Object, 
two objects will be created i.e. 
One in the Heap Area and One in the String constant pool 
and the String object reference always points to heap area object. 

When line-1 execute, 
it will create two objects and pointing to the heap area created object. 

Now when line-2 executes, 
it will refer to the object which is in the SCP. 

Again when line-3 executes, 
it refers to the same object which is in the SCP area because,
the content is already available in the SCP area. 
No need to create a new one object.
```
![intern2](https://user-images.githubusercontent.com/37740006/74352397-a1c1c600-4de2-11ea-8c89-772d72307311.png)

```
If the corresponding String constant pool(SCP) object is not available
then intern() method itself will create the corresponding SCP object.
```

```.java
// Java program to illustrate  
// intern() method  
class GFG {  
    public static void main(String[] args)  
    {  
        // S1 refers to Object in the Heap Area  
        String s1 = new String("GFG"); // Line-1  
  
        // S2 now refers to Object in SCP Area  
        String s2 = s1.concat("GFG"); // Line-2  
  
        // S3 refers to Object in SCP Area 
        String s3 = s2.intern(); // Line-3  
  
        System.out.println(s2 == s3);  
  
        // S4 refers to Object in the SCP Area  
        String s4 = "GFGGFG"; // Line-4  
  
        System.out.println(s3 == s4);  
    }  
}  
Output:

true
true
```


## Explanation : 
```
We use intern() method to get the reference of corresponding SCP Object. 

In this case, when Line-2 executes
s2 will have the value “GFGGFG” in it only creates one object. 

In Line-3, 
we try to intern s3 which is again with s2 in SCP area. 
s4 is also in SCP so all give output as true when compared.
```
![intern3](https://user-images.githubusercontent.com/37740006/74352605-f402e700-4de2-11ea-8f11-e143c15bfff1.png)

# 8. String replace()

```.java
package javastrings.Class.Stirng;

public class _8_StringReplace {

	public static void main(String[] args) {
		String s1 = "Java is a programming language.Java is a iceland";
		System.out.println(s1);
		String replaceString = s1.replace("Java", "Kava");
		System.out.println(replaceString);
		System.out.println(replaceString.replace("Kava", "Java"));
		System.out.println(s1.replace("a", "A"));
		
	}
}
/*
 *  Java is a programming language.Java is a iceland
 *  Kava is a programming language.Kava is a iceland 
 *  Java is a programming language.Java is a iceland
 *  JAvA is A progrAmming lAnguAge.JAvA is A icelAnd
 */
```
# 9. String compareTo()
```
package javastrings.Class.Stirng;

public class _9_StringCompateTo{  
	public static void main(String args[]){  
		String s1="hello";  
		String s2="hello";  
		String s3="meklo";  
		String s4="hemlo";  
		String s5="flag";  
		System.out.println(s1.compareTo(s2));//0 because both are equal  
		System.out.println(s1.compareTo(s3));//-5 because "h" is 5 times lower than "m"  
		System.out.println(s1.compareTo(s4));//-1 because "l" is 1 times lower than "m"  
		System.out.println(s1.compareTo(s5));//2 because "h" is 2 times greater than "f"  
	}
}  
```
# 10. String concat()
```.java
package javastrings.Class.Stirng;

public class _10_StringConcat {  
    public static void main(String[] args) {      
        String str1 = "Hello";  
        String str2 = "Javatpoint";  
        String str3 = "Reader";  
        // Concatenating one string   
        String str4 = str1.concat(str2);          
        System.out.println(str4);  
        // Concatenating multiple strings  
        String str5 = str1.concat(str2).concat(str3);  
        System.out.println(str5);  
    }  
}  

//HelloJavatpoint
//HelloJavatpointReader
```
# 11. String contains()

```.java
package javastrings.Class.Stirng;

public class StringContains {

	public static void main(String[] args) {
		String nameString = "What do you know about me";
		System.out.println(nameString.contains("do you")); // true
		System.out.println(nameString.contains("about")); // true
		System.out.println(nameString.contains("About")); // false // case sensitive
		
		if(nameString.contains("me")) {
			System.out.println("You know me.");
		}
		else {
			System.out.println("You don'tnow me..");
		}
	
	
	}

}
```
# 12. String equals()
```.java
package javastrings.Class.Stirng;

public class StringEqualsTo {

	public static void main(String[] args) {
		String s1 = "Javapoint";
		String s2 = "Javapoint";
		String s3 = "JavaPoint";
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.equals(s3)); // false
		if(s1.equals(s2)) {
			System.out.println("Both are equal"); // both are equal
		}
		else {
			System.out.println("Not equal");
		}

	}

}
```
# 13. String equalsIgnoreCase()

```.java
/*
The String equalsIgnoreCase() method compares the two given strings on 
the basis of content of the string irrespective of case of the string.

It is like equals() method but doesn't check case. 

If any character is not matched, it returns false otherwise it returns true.

*/

package javastrings.Class.Stirng;

import java.util.ArrayList;

public class _13_StringEqualsIgnoreCase {

	public static void main(String[] args) {
		String s1 = "Javapoint";
		String s2 = "JAVAPOINT";
		String s3 = "JavaTPoint";
		String s4 = "JavaTPOINT";
	
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equalsIgnoreCase(s4));
		
		
		 // if we ignore the cases both the strings are equal. 
		// it will ignore case sensivity
	    boolean result1 = s2.equalsIgnoreCase(s1); 
	    System.out.println("str2 is equal to str1 = " + result1); 
	  
	    // even if ignoring the cases both the strings are not equal. 
	    boolean result2 = s2.equalsIgnoreCase(s3); 
	    System.out.println("str2 is equal to str3 = " + result2); 
		
		
		
		equalsIgnoreCaseMethodUsingList();
		
	}

	private static void equalsIgnoreCaseMethodUsingList() {
		
		String str1 = "Mohammad";
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Rahman");
		list.add("Rahim");
		list.add("Sattar");
		list.add("Jabbar");
		list.add("Mohammad");
		
		
		for (String str : list) {
			if(str.equalsIgnoreCase(str1)) {
				System.out.println("Mohammad(sm) is our messanger");
			}
			
		}
		
		
	}

}


/*
true
false
false
Mohammad(sm) is our messanger
*/
```
# 14. String format()

```.java
/*
Returns a formatted string using the given locale,specified format string and arguments.
	1. We can concatenate the strings using this method and at the same time,
	2. we can format the output concatenated string.
*/

package javastrings.Class.Stirng;

public class _14_StringFormat {  
    public static void main(String[] args) {  
    	 
    	String str = "GeeksforGeeks."; 
    	  
         // Concatenation of two strings 
         String gfg1 = String.format("My Company name is %s", str); 
   
         // Output is given upto 8 decimal places 
         String str2 = String.format("My answer is %.8f", 47.65734); 
   
         // between "My answer is" and "47.65734000" there are 15 spaces 
         String str3 = String.format("My answer is %15.8f",47.65734); 
   
         System.out.println(gfg1); 
         System.out.println(str2); 
         System.out.println(str3); 
         
         String str1 = "GFG"; 
         String sr2 = "GeeksforGeeks"; 
   
         //%1$ represents first argument, %2$ second argument 
         String gfg2 = String.format("My Company name is: %1$s, %1$s and %2$s", str1, sr2); 
   
         System.out.println(gfg2); 
    }  
  
}  
/*

My Company name is GeeksforGeeks.
My answer is 47.65734000
My answer is     47.65734000
My Company name is: GFG, GFG and GeeksforGeeks
0007044

*/
```
# 15. String getBytes()

```.java
/*
The java string getBytes() method returns the byte array of the string. 
In other words, it returns sequence of bytes.
*/

package javastrings.Class.Stirng;


public class _15_StringGetBytes {

	public static void main(String[] args) {
		String s1 = "ABCDEFG";
		byte[] barr = s1.getBytes();
		for (int i = 0; i < barr.length; i++) {
			System.out.println(barr[i]);
		}
		
		String s2 = new String(barr);
		System.out.println(s2);

	}

}
/*
 * 65 
 * 66 
 * 67 
 * 68 
 * 69 
 * 70 
 * 71 
 * ABCDEFG
 */
```
# 16. String getChars()

```.java
/*
The java string getChars() method copies the content of this string into specified char array. 
There are 4 arguments passed in getChars() method. The signature of getChars() method is given below:
*/


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
```
# 17. String indexOf()

```.java
// The java string indexOf() method returns index of given character value or substring. 
// If it is not found, it returns -1. The index counter starts from zero.

package javastrings.Class.Stirng;

public class _17_StringIndexOf {

	public static void main(String[] args) {
		String s1 = "I am from Bangladesh.";
		System.out.println(s1.indexOf("from")); // 5
		System.out.println(s1.indexOf('I')); //0
		System.out.println(s1.indexOf("Ban")); // 10
		
		
		 String s11 = "This is indexOf method";         
	        // Passing char and index from  
		 	// This method takes char and index as arguments and returns index of first character occured after the given fromIndex. 
	        int index = s11.indexOf('e', 12); //Returns the index of this char  
	        System.out.println("index of char "+index);     // index of char 17   

	}

}
```
# 18. String isEmpty()

```.java
// The java string isEmpty() method checks if this string is empty or not. 
// It returns true, if length of string is 0 otherwise false. 
// In other words, true is returned if string is empty otherwise it returns false.

package javastrings.Class.Stirng;

// The java string isEmpty() method checks if this string is empty or not. 
// It returns true, if length of string is 0 otherwise false. 
// In other words, true is returned if string is empty otherwise it returns false.

public class _18_StringIsEmpty {

	public static void main(String[] args) {
		String s1 = "";
		String s2 = "Javaworld";
		System.out.println(s1.isEmpty()); // true
		System.out.println(s2.isEmpty()); // false

		if(s1.length()== 0 || s1.isEmpty()) { 
			// s1 is empty 
			// OR operation 
			// je kono ekta true holei true (0, 1 = 1) (0 0 = 0),(1,1 = 1)
			System.out.println("String s1 is empty...");
		}
		else {
			System.out.println(s1);
		}
		if(s2.length()==0 || s2.isEmpty()) {
			System.out.println("S2 is empty..");
		}
		else {
			System.out.println(s2);
		}
	}

}
/*
 * true 
 * false 
 * String s1 is empty... 
 * Javaworld
 */
```
# 19. String join()

```.java
package javastrings.Class.Stirng;

public class _19_StringJoin {

	public static void main(String[] args) {
		String dateString = String.join("/", "12","12","2019");
		System.out.println(dateString);
		String timeString = String.join(":", "12","10","30");
		System.out.println(timeString);
				
		 // delimiter is "->" and elements are "Wake up",  
        // "Eat", "Play", "Sleep", "Wake up" 
  
        String gfg3 = String.join("-> ", "Wake up", "Eat", 
                      "Play", "Sleep", "Wake up"); 
  
        System.out.println(gfg3); 
        
        // delimiter is "  " and elements are "My", 
        // "name", "is", "Niraj", "Pandey" 
        String gfg2 = String.join("  ", "My", "name", "is", "Niraj", "Pandey"); 
  
        System.out.println(gfg2);
        
        // delimiter is "<" and elements are "Four", "Five", "Six", "Seven" 
        String gfg1 = String.join(" < ", "Four", "Five", "Six", "Seven"); 
  
        System.out.println(gfg1);
	}

}
/*
12/12/2019
12:10:30
Wake up-> Eat-> Play-> Sleep-> Wake up
My  name  is  Niraj  Pandey
Four < Five < Six < Seven
*/
```

# 20. String lastIndexOf()

```.java
package javastrings.Class.Stirng;
// The java string lastIndexOf() method returns last index of the given character value or substring. 
// If it is not found, it returns -1. The index counter starts from zero.
public class _20_StringLastIndexOf {
	public static void main(String args[]) {
		String s4 = "This is index of lastindex.";
		System.out.println(s4.lastIndexOf('s')); //19
		System.out.println(s4.lastIndexOf('s', 5)); // 3
	}
}
```
# 21. String replaceAll()

```.java
package javastrings.Class.Stirng;

// The java string replaceAll() method returns a string replacing all 
// the sequence of characters matching regex and replacement strin

public class StringReplaceAll {

	public static void main(String[] args) {
		String s1="javatpoint is a very good website";  
		String replaceString=s1.replaceAll("a","e");//replaces all occurrences of "a" to "e"  
		System.out.println(replaceString);
		System.out.println(s1.replaceAll("is", "was"));

	}

}
// jevetpoint is e very good website
// javatpoint was a very good website
```
# 22. String split()

```.java
package javastrings.Class.Stirng;
// The given example returns total number of words in a string excluding space only. 
// It also includes special characters.

public class _22_StringSplit {
	public static void main(String args[]) {
		String s1="java string split method by javatpoint";  
		String[] wordStrings = s1.split("\\s");
		String capitalizeString = "";

		for(String wString:wordStrings) {
			String firString = wString.substring(0,1);
			String afterString = wString.substring(1);
			capitalizeString+=firString.toUpperCase()+afterString.toLowerCase()+" ";
			System.out.println(capitalizeString.trim());
		}

		String s2="java string split method by javatpoint";  
		
		System.out.println("--------Method of split------");
		
		for(String w:s2.split("\\s",6)) {
			System.out.println(w);
		}
		
		System.out.println();
		
		String str = "Javatpointtt";  
        System.out.println("Returning words:");  
        String[] arr = str.split("t", 0);  
        
        for (String w : arr) {  
            System.out.println(w);  
        } 

        System.out.println("Split array length: "+arr.length);  
	}
}
/*
java
string
split
method
by
javatpoint

--------Method of split------
java
string
split
method
by
javatpoint

Returning words:
Java
poin
Split array length: 2
*/
```

# 23. String substring()

```.java
/*
The java string substring() method returns a part of the string.

We pass begin index and end index number position in the java 
substring method where start index is inclusive and end index is exclusive. 
In other words, start index starts from 0 whereas end index starts from 1.

There are two types of substring methods in java string.
*/

package javastrings.Class.Stirng;

public class _23_StringSubdtring {

	public static void main(String[] args) {
		
		String s1 = "javatpoint";
		System.out.println(s1.substring(2,4));
		System.out.println(s1.substring(2));

	}
// va
// vatpoint
```
# 24. String toCharArray()

```.java
package javastrings.Class.Stirng;

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
		
		
		System.out.println("Length of array :"+len);
		for (int i = 0; i < ch2.length; i++) {
			System.out.println(ch2[i]);
		}
	}
}
/*
h
e
l
l
o
Length of array :25
W
e
l
c
o
m
e
 
t
o
 
t
h
e
 
j
a
v
a
 
w
o
r
l
d
*/
```
# Chapter 7 : Java StringBuffer
```
Java StringBuffer class is used to create mutable (modifiable) string. 
The StringBuffer class in java is same as String class except it is mutable i.e. it can be changed.

```
```
Note: Java StringBuffer class is thread-safe i.e. 
multiple threads cannot access it simultaneously. 
So it is safe and will result in an order
```
# 7.1. StringBuffer append() method
```.java
class StringBufferExample{  
	public static void main(String args[]){  
		StringBuffer sb=new StringBuffer("Hello ");  
		sb.append("Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java  
	}  
}  
```
# 7.2. StringBuffer insert() method
```.java
//The insert() method inserts the given string with this string at the given position.

class StringBufferExample2{  
	public static void main(String args[]){  
		StringBuffer sb=new StringBuffer("Hello ");  
		sb.insert(1,"Java");//now original string is changed  
		System.out.println(sb);//prints HJavaello  
	}  
}  
```

# 7.3. StringBuffer replace() method
```
//The replace() method replaces the given string from the specified beginIndex and endIndex.

class StringBufferExample3{  
	public static void main(String args[]){  
		StringBuffer sb=new StringBuffer("Hello");  
		sb.replace(1,3,"Java");  
		System.out.println(sb);//prints HJavalo  
	} 
} 
```

# 7.4. StringBuffer delete() method
```.java
The delete() method of StringBuffer class deletes the string from the specified beginIndex to endIndex.

class StringBufferExample4{  
	public static void main(String args[]){  
		StringBuffer sb=new StringBuffer("Hello");  
		sb.delete(1,3);  
		System.out.println(sb);//prints Hlo  
	}  
}  
```
# 7.5. StringBuffer reverse() method
```.java
// The reverse() method of StringBuilder class reverses the current string.

class StringBufferExample5{  
	public static void main(String args[]){  
		StringBuffer sb=new StringBuffer("Hello");  
		sb.reverse();  
		System.out.println(sb);//prints olleH  
	}  
} 
```
# 7.6. StringBuffer capacity() method
```
The capacity() method of StringBuffer class returns the current capacity of the buffer. 
The default capacity of the buffer is 16. If the number of character increases from its current capacity, 
it increases the capacity by (oldcapacity*2)+2. 
For example if your current capacity is 16, it will be (16*2)+2=34.
```
```.java
class StringBufferExample6{  
	public static void main(String args[]){  	
	StringBuffer sb=new StringBuffer();  
	System.out.println(sb.capacity());//default 16  
	sb.append("Hello");  
	System.out.println(sb.capacity());//now 16  
	sb.append("java is my favourite language");  
	System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
	}  
} 
``` 
# 7.7. StringBuffer ensureCapacity() method
```
The ensureCapacity() method of StringBuffer class ensures that 
the given capacity is the minimum to the current capacity. 
If it is greater than the current capacity, 
it increases the capacity by (oldcapacity*2)+2. 
For example if your current capacity is 16, it will be (16*2)+2=34.
```
```.java
class _7_StringBufferEnsureCapacity{  
	public static void main(String args[]){  
		StringBuffer sb=new StringBuffer();  
		System.out.println(sb.capacity());//default 16  
		sb.append("Hello");  
		System.out.println(sb.capacity());//now 16  
		sb.append("java is my favourite language");  
		System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
		sb.ensureCapacity(10);//now no change  
		System.out.println(sb.capacity());//now 34  
		sb.ensureCapacity(50);//now (34*2)+2  
		System.out.println(sb.capacity());//now 70  
	}  
}
```
# Chapter 8 : Java StringBuilder class
```
Java StringBuilder class is used to create mutable (modifiable) string. 
The Java StringBuilder class is same as StringBuffer class except that it is non-synchronized.
```
# 8.1 StringBuilder append() method
```.java
//The StringBuilder append() method concatenates the given argument with this string.
package javastrings.Class.StringBuilder;

public class _1_StringBuilderAppend{
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
        sb.append("Java");
		System.out.println(sb);
	}
}
// Output : HelloJava
```
# 8.2. StringBuilder insert() method
```.java
// The StringBuilder insert() method inserts the given string with this string at the given position.
package javastrings.Class.StringBuilder;

public class _2_StringBuilderInert
{
	public static void main(String[] args) {
	
	    StringBuilder sb = new StringBuilder("Hello");
	    sb.insert(1,"Java");
		System.out.println(sb);
	}
}
// Output : HJavaello
```
# 8.3. StringBuilder replace() method
```.java
// The StringBuilder replace() method replaces the given string from the specified beginIndex and endIndex.
package javastrings.Class.StringBuilder;

public class _3_StringBuilderReplace
{
	public static void main(String[] args) {
	
	    StringBuilder sb = new StringBuilder("Hello");
	    sb.replace(1,3,"Java");
		System.out.println(sb);
	}
}
// Output : HJavalo

```
# 8.4. StringBuilder delete() method
```.java
// The delete() method of StringBuilder class deletes the string from the specified beginIndex to endIndex.
package javastrings.Class.StringBuilder;

public class _4_StringBuilderDelete
{
	public static void main(String[] args) {
	
	    StringBuilder sb = new StringBuilder("Hello");
	    sb.delete(1,3);
		System.out.println(sb);
	}
}
// Output : Hlo
```
# 8.5. StringBuilder reverse() method
```.java
package javastrings.Class.StringBuilder;
//The reverse() method of StringBuilder class reverses the current string.
public class _5_StringBuilderReverse
{
	public static void main(String[] args) {
	
	    StringBuilder sb = new StringBuilder("Hello");
	    sb.reverse();
		System.out.println(sb);
	}
}
// Output : olleH

```
# 8.6. StringBuilder capacity() method
```
The capacity() method of StringBuilder class returns the current capacity of the Builder. 
The default capacity of the Builder is 16. 
If the number of character increases from its current capacity, 
it increases the capacity by (oldcapacity*2)+2. 
For example if your current capacity is 16, it will be (16*2)+2=34.
```
```.java
package javastrings.Class.StringBuilder;

public class _6_StringBuilderCapacity
{
	public static void main(String[] args) {
	
	    StringBuilder sb = new StringBuilder("Hello");
	   
		System.out.println(sb.capacity());
	}
}
// Output : 21


```
# 8.7. StringBuilder ensureCapacity() method
```
The ensureCapacity() method of StringBuilder class ensures that 
the given capacity is the minimum to the current capacity. 
If it is greater than the current capacity, it increases 
the capacity by (oldcapacity*2)+2. For example if your current capacity is 16, 
it will be (16*2)+2=34.
```
```.java
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
```