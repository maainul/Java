# Constructor in Java
## Why it is called constructor?
```
	it is called constructor because it constructs the value at the time of object creation.
	It is not necessary to write a constructor for a class.
	It is because java compiler creates a default constructor if your class does not have any.

```
```
	1. block of codes similar to method.
	2. it is called when an instance of the class is created.
	3. At the time of calling constructor, memory for the object is allocated in the memory.
	4. it is a special type of method
	5. used to initialize the object.
```
### Every time an object is created using the new() keyword,
    at least one constructor is called.
```
	It calls a default constructor if there is no constructor avaiable in the class. 
	in such case constructor by default.
```
## Types of constructor
```
	1) Default constructor(no-args constructor)
	2) parameterized constructor
```
## Rules of creating java constructor
```
There are two defined for the constructor:
	1. Constructor name must be same name as its class name.
	2. A constructor must have no explicit return type.
	3. A java constructor cannot be abstruct, static and final and synchronized.
	4. we can have private, protected, public or default constructor 
```
## Java Default constructor
```
A default constructor is called when it does't have any parameter.

	class name (){}
```
## Example of default constructor

```.java
class Bike1{
	//creating a default constructor
	Bike1(){
		System.out.println("bike is created.");
	}
	// main method
	public static static void main(String args []){
	//calling a default constructor
		Bike1 b = new Bike1();
	}
}

Output: bike is created.
```

>> Rule: If there is no constructor in a class, compiler automatically creates a default constructor.

## :+1: Q: What is the purpose of a default constructor
```
The default constructor is used to provide the default values to the objects like 0, null,etc. depending on the type.
```

## Example of a default constructor that display the default values.
```.java

class Student{
	int id;
	String name;

	void display(){
		System.out.println(id+" "+name);
	}
}

class Main{
	public static void main(String args[]){
		Student s1 = new Student():
		Student s2 = new Student();
		s1.display();
		s2.display();
	}
} 

Output:
	0 null
	0 null
```
```
Explanation:In the above class,you are not creating any constructor
so compiler provides you a default constructor. 
Here 0 and null values are provided by default constructor.
```
## Java parameterized constructor

```
A constructor which has a specific number of parameter is called parameterized constructor.
```
## Why use the parameterized constructor?
```
The parameterized constructor is used to provide different values to distinct objects.
However, You can provide the same values also.
```
## Example of parameterized constructor

```.java
class Student2{
	int id;
	String name;
	
	public Student2(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void display(){
		System.out.println(id+" "+name);
	}
}

class Main2{
	public static void main(String args[]){
		Student2 s1 = new Student2(121,"anik");
		Student2 s2 = new Student2(102,"hasan");
		s1.display();
		s2.display();
	}
} 
```
## Constructor Overloading
```
In Java, a constructor is just like a method but without return type. 
It can also be overloaded like Java methods.

Constructor overloading in Java is a technique of having more than one constructor with different parameter lists. 
They are arranged in a way that each constructor performs a different task. 
They are differentiated by the compiler by the number of parameters in the list and their types.	
```
```.java

class Student3{
	
	int id;
	String name;
	int age;
	
	public Student3(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Student3(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public void display() {
		System.out.println(id+" "+name+" "+age);
	}
	
}

public class Main3 {
	public static void main(String args[]) {
		Student3 s1 = new Student3(124,"mainul");
		Student3 s2 = new Student3(123,"anik",26);
		s1.display();
		s2.display();
	}

}

Output:
	124 mainul 0
	123 anik 26

```
## Java Copy Constructor
```
There is no copy constructor in Java. 
However, we can copy the values from one object to another like copy constructor in C++.

There are many ways to copy the values of one object into another in Java. 
They are:

	1. By constructor
	2. By assigning the values of one object into another
	3. By clone() method of Object class
```
```.java

class Student4{
	
	int id;
	String name;
	int age;
	
	public Student4(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public Student4(Student4 s) {
		this.id = s.id;
		this.name = s.name;
		this.age = s.age;
	}
	
	public void display() {
		System.out.println(id+" "+name+" "+age);
	}
	
}

public class Main4 {
	public static void main(String args[]) {
		Student4 s1 = new Student4(124,"mainul",23);
		Student4 s2 = new Student4(s1);
		s1.display();
		s2.display();
	}

}

Output:
	124 mainul 23
	124 mainul 23

```
## Copying values without constructor

```.java


class Student7{  
    int id;  
    String name;  
    
    Student7(int i,String n){  
    	id = i;  
    	name = n;  
    }  
    Student7(){
    	}  
    
    void display(){
    	System.out.println(id+" "+name);
    	}
}
    
public class Main5 {
	public static void main(String args[]){  
		Student7 s1 = new Student7(111,"Karan");  
    	Student7 s2 = new Student7();  
    	s2.id=s1.id;  
    	s2.name=s1.name;  
    	s1.display();  
    	s2.display();  
    }  
}
   
Output:

	111 Karan
	111 Karan

```
# FAQ

## Q) Does constructor return any value?
```
Yes, it is the current class instance (You cannot use return type yet it returns a value).
```
## Q) Can constructor perform other tasks instead of initialization?
```
Yes, like object creation, starting a thread, calling a method, etc. 
You can perform any operation in the constructor as you perform in the method.
````

## Q) Is there Constructor class in Java?
```
Yes.
```

## Q) What is the purpose of Constructor class?
```
Java provides a Constructor cl
```














