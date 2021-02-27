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
	public static void rotateDigit(String[] args) {
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
	public static void rotateDigit(String[] args) {
	
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
	public static void rotateDigit(String[] args) {
	
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
	public static void rotateDigit(String[] args) {
	
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
	public static void rotateDigit(String[] args) {
	
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
	public static void rotateDigit(String[] args) {
	
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
	public static void rotateDigit(String[] args) {
	
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
# Difference between String and StringBuffer
```
There are many differences between String and StringBuffer. 
A list of differences between String and StringBuffer are given below:
```
![strigbufferVSstring](https://user-images.githubusercontent.com/37740006/74448371-09404a00-4ea5-11ea-99da-c3f07e2f4d12.png)

```.java
package javastrings;

public class StringAndStringBufferPerformanceTesr
{
    
    public static String concatWithString(){
        String t = "Java";
        for (int i=0;i<1000;i++){
            t = t+ "TPoint";
        }
        return t;
    }
    
    public static String concatWithStringBuffer(){
        StringBuffer sb = new StringBuffer("Java");
        for (int i=0;i<1000;i++){
           sb.append("Tpoint");
        }
        return sb.toString();
    }
    
    
	public static void rotateDigit(String[] args) {
		System.out.println("Hello World");
	
		long startTime =System.currentTimeMillis();  
		concatWithString();
		System.out.println("Time taken by Concating with String: "+(System.currentTimeMillis()-startTime)+"ms");  
	
		startTime = System.currentTimeMillis();  
        concatWithStringBuffer();  
        System.out.println("Time taken by Concating with  StringBuffer: "+(System.currentTimeMillis()-startTime)+"ms"); 
		
	}
}
/*
 * Hello World 
 * Time taken by Concating with String: 8ms 
 * Time taken by Concating with StringBuffer: 1ms
 */
```



# Difference between StringBuffer and StringBuilder
```
Java provides three classes to represent a sequence of characters: String, StringBuffer, and StringBuilder. 
	1. String class immutable class whereas 
	2. StringBuffer and StringBuilder classes are mutable. 

There are many differences between StringBuffer and StringBuilder. 
The StringBuilder class is introduced since JDK 1.5.
```
![stringbufferandstringbuilder](https://user-images.githubusercontent.com/37740006/74448534-5a503e00-4ea5-11ea-8725-84cb0e004e5e.png)

```.java
package javastrings;

//Java Program to demonstrate the performance of StringBuffer and StringBuilder classes.  
public class StringBufferAndStringBuilder{ //StringBufferandStringBuilder 
  public static void rotateDigit(String[] args){  
      long startTime = System.currentTimeMillis();  
      StringBuffer sb = new StringBuffer("Java");  
      for (int i=0; i<10000; i++){  
          sb.append("Tpoint");  
      }  
      System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
      startTime = System.currentTimeMillis();  
      StringBuilder sb2 = new StringBuilder("Java");  
      for (int i=0; i<10000; i++){  
          sb2.append("Tpoint");  
      }  
      System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  
  }  
}

//Time taken by StringBuffer: 4ms
//Time taken by StringBuilder: 2ms
```
