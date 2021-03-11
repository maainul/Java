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
	public static void rotateDigit(String args[]){  
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
	public static void rotateDigit(String args[]){  
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
	public static void rotateDigit(String args[]){  
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
	public static void rotateDigit(String args[]){  
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
	public static void rotateDigit(String args[]){  
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
	public static void rotateDigit(String args[]){  	
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
	public static void rotateDigit(String args[]){  
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