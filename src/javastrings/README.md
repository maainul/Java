# Java String
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
```
The CharSequence interface is used to represent the sequence of characters. 
  1.String, 
  2.StringBuffer and 
  StringBuilder classes implement it. 
It means, we can create strings in java by using these three classes.
```

# CharSequence in Java
```
The Java String is immutable which means it cannot be changed. 
Whenever we change any string, a new instance is created. 
```
# For mutable strings, you can use StringBuffer and StringBuilder classes.
