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











