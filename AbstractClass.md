# Abstract class in java
```
A class which is declared with the abstract keyword is known as an abstract class in Java. 
It can have abstract and non-abstract methods (method with the body).

Before learning the Java abstract class, 
let's understand the abstraction in Java first.
```
# Abstraction in java
```
Abstraction is a process of hiding the implementation details and showing only functionality to the user.

Another way, it shows only essential things to the user and hides the internal details, 
for example, sending SMS where you type the text and send the message. 
You don't know the internal processing about the message delivery.

Abstraction lets you focus on what the object does instead of how it does it.
```
# Ways to achieve Abstraction
```
There are two ways to achieve abstraction in java

    Abstract class (0 to 100%)
    Interface (100%)
```
# Points to Remember
```
    1. An abstract class must be declared with an abstract keyword.
    2. It can have abstract and non-abstract methods.
    3. It cannot be instantiated.
    4. It can have constructors and static methods also.
    5. It can have final methods which will force the subclass not to change the body of the method.
```
# Example using Dynamic method dispatch

```.java
class Bike{
	void run() {
		System.out.println("run man run");
	}
}


public class Abs1 extends Bike{
	void run() {
		System.out.println("this is main run.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bike = new Abs1();
		bike.run();

	}

}

Output: 

this is main run.

```

# Example of Abstract class that has an abstract method

```
In this example, Bike is an abstract class that contains only one abstract method run. 
Its implementation is provided by the Honda class.
```
```.java
abstract class Bike{  
  abstract void run();  
}  
class Honda4 extends Bike{  
	void run(){System.out.println("running safely");}  
	public static void main(String args[]){  
 		Bike obj = new Honda4();  
 		obj.run();  
	}  
}  

Output: 
running safely
```
# Understanding the real scenario of Abstract class

```.java
// method overriding 
// it extends class from parent class
// parent class----> child class.

abstract class Shapee{
	abstract void draw();
}

class Rectanglee extends Shapee{
	void draw() {
		System.out.println("This will draw rectangle...");
	}
}

class Circlee extends Shapee{
	void draw() {
		System.out.println("It will draw circle...");
	}
}

public class Abstrace2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapee s; // s is a reference variable of Shape
		// assign reference variable s in the Rectangle class.
		s = new Rectanglee();
		s.draw();
		// assign reference variable s in the Circle class.
		s = new Circlee();
		s.draw();

	}

}

Output:
	
	This will draw rectangle...
	It will draw circle...

```
# Another example of Abstract class in java

```.java

abstract class Bank{    
	abstract int getRateOfInterest();    
}    

class SBI extends Bank{    
	int getRateOfInterest(){return 7;}    
}    

class PNB extends Bank{    
	int getRateOfInterest(){return 8;}    
}    
    
class TestBank{    
	public static void main(String args[]){    
		Bank b;  
		b=new SBI();  
		System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
		b=new PNB();  
		System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
	}
}   

Output: 

Rate of Interest is: 7 %
Rate of Interest is: 8 %
```

# Abstract class having constructor, data member and methods
```
An abstract class can have a data member, abstract method, method body (non-abstract method), constructor, and even main() method.
```







