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
The String compareTo() method compares values lexicographically and returns an integer value that describes if first string is less than, equal to or greater than second string.

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
#4. String charAt()
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
//The string valueOf() method coverts given type such as int, long, float, double, boolean, char and char array into string.

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
```.java





```
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