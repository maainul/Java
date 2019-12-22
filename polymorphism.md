

## Java Polymorphism
### Method Overriding in Java

```
If subclass has the same method as declared in the parent class it is known as method overloading.

```
### Usage of Java Method Overriding
```
	Specific implementation of a method which is already provided by its superclass.
	Used for runtime polymorphism
```
### Rules for Java Method Overriding
```
	1. The method must have the same name as in the parent class
	2. The method must have the same parameter as in the parent class.
	3. There must be an IS-A relationship (inheritance).
```
### Without Overridding

```.java
class Vehicle{
	void run () {
		System.out.println("Vehicle is running..");
	}
}

public class Bike extends Vehicle {
	public static void main(String[] args) {
	Bike bike = new Bike();
	bike.run();
	
	}
}

```
### With overriding

```.java
class Vehicle{
	void run () {
		System.out.println("Vehicle is running..");
	}
}

public class Bike extends Vehicle {
	void run() {
		System.out.println("Bike is running safely..");
	}
	public static void main(String[] args) {
	Bike bike = new Bike();
	bike.run();
	
	}
}

```
### A real example of Java Method Overriding
```
Consider a scenario where Bank is a class that provides functionality to get the rate of interest. 
However, the rate of interest varies according to banks. 
For example, SBI, ICICI and AXIS banks could provide 
8%, 7%, and 9% rate of interest.
```
```.java

class Baank{
	int getRateOfInterest() {
		return 0;
	}
}

class SBI extends Baank{
	int getRateOfInterest() {
		return 8;
	}
}

class ICICI extends Baank{
	int getRateOfInterest() {
		return 7;
	}
}

class AXIS extends Baank{
	int getRateOfInterest() {
		return 9;
	}
}

public class BankInterest {

	public static void main(String[] args) {
		SBI sbi = new SBI();
		ICICI icici = new ICICI();
		AXIS axis = new AXIS();
		System.out.println("SBI rate of interest : "+sbi.getRateOfInterest());
		System.out.println("ICICI rate of interest : "+icici.getRateOfInterest());
		System.out.println("AXIS rate of interest : "+axis.getRateOfInterest());
	}

}

Output:
SBI Rate of Interest: 8
ICICI Rate of Interest: 7
AXIS Rate of Interest: 9

```
## Super Keyword in Java
```
The super keyword in Java is a reference variable which is
used to refer immediate parent class object.

```
### Usage of Java super Keyword
```
	1. Super can be used to refer immediate parent class instance variable.
	2. Super can be used to invoke immediate parent class method.
	3. Super() can be used to invoke immediate parent class constructor.
```
### 1) super is used to refer immediate parent class instance variable.

```.java
	/ We can use super keyword to access the data member or field of parent class. 
	/ It is used if parent class and child class have same fields.

package net.codejava;

class Animal{  //super class
	String colorString = "white";
}

class Dog extends Animal{
	String colorString = "Black";

	void printcolor() {  //sub class
		System.out.println(colorString);
		System.out.println(super.colorString);
	}
}

public class TestSuper1 {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.printcolor();

	}

}
```
### 2) super can be used to invoke parent class method
```.java
/ It should be used if subclass contains the same method as parent class. 
/ In other words, it is used if method is overridden.

package net.codejava;

class Anymal{
	void eat() {
		System.out.println("eating..");
	}
}

class MrDog extends Anymal{
	void eat() {
		System.out.println("eating bread");
	}
	
	void bark() {
		System.out.println("barking");
	}
	
	void work() {
		super.eat();
		bark();
	}
}

public class TestSuper2 {

	public static void main(String[] args) {
		MrDog dog = new MrDog();
		dog.work();
	}

}

Output:
	eating..
	barking

/*
 * In the above example Animal and Dog both classes have eat() method if we call
 * eat() method from Dog class, it will call the eat() method of Dog class by
 * default because priority is given to local.
 * 
 * To call the parent class method, we need to use super keyword.
 */


```
### 3) super is used to invoke parent class constructor.
```.java

class Animal{
	public Animal() {
		// TODO Auto-generated constructor stub
		System.out.println("animal is created..");
	}
}

class Dog extends Animal{
	public Dog() {
		// TODO Auto-generated constructor stub
		super();
		System.out.println("dog is created..");
	}
}

public class TestSuper3 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		
	}
}

Output:
	animal is created
	dog is created
```

### super example: real use

```.java
/*	Let's see the real use of super keyword. 
	Here, Emp class inherits Person class so all the properties of Person will 
	be inherited to Emp by default.To initialize all the property, 
	we are using parent class constructor from child class. 
	In such way, we are reusing the parent class constructor.
*/
package net.codejava;


class Person{
	int id;
	String nameString;
	
	public Person(int id, String nameString) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.nameString = nameString;
	}
}

class Emp extends Person{
	float salary;
	public Emp(int id, String nameString, float salary) {
		super(id, nameString);
		this.salary = salary;
	}
	
	void dispay() {
		System.out.println(id+" "+nameString+" "+salary);
	}
}

public class TestSuper5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp emp = new Emp(101, "Mainul Hasan", 35000);
		emp.dispay();
	}

}

Output: 101 Mainul Hasan 35000.0

```
## Final Keyword In Java

```
The final keyword in java is used to restrict the user. The java final keyword can be used in many context. Final can be:

	1. variable
	2. method
	3. class
```
### 1.Final Variable
```.java
package net.codejava;

class Bike9{
	final int speedlimit = 90;
	
	void run() {
		
		//speedlimit = 400; //The final field Bike9.speedlimit cannot be assigned
	}

}



public class FinalTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike9 bike9 = new Bike9();
		// bike9.run(); //it will not work
		System.out.println(bike9.speedlimit);
		

	}

}

// Output:Compile Time Error
```
### 2. Final Method

```.java
package net.codejava;

class Bike{
	
	final void run() {
		System.out.println("running");
	}
}

// final class cannot be extended.
class Honda extends Bike{
	void run () { // error // compile time error
		// final method cannot override
		System.out.println("running safely");
	}
}

public class FinalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bike = new Bike();
		bike.run();
	}

}

// Output:Compile Time Error
```
### 3. Final Class

```.java
package net.codejava;

final class Bike{
	
	final void run() {
		System.out.println("running");
	}
}

// final class cannot be extended.
class Honda extends Bike{
	void run () { // error // compile time error
		// final method cannot override
		System.out.println("running safely");
	}
}

public class FinalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bike = new Bike();
		bike.run();
	}

}

// Output:Compile Time Error
```
### Runtime Polymorphism

```
Polymorphism in Java is a concept by which we can perform 
a single action in different ways.

There are two types of polymorphism in Java: 
	1.compile-time polymorphism and 
	2. runtime polymorphism. 
	
We can perform polymorphism in java by 
	1. method overloading and 
	2. method overriding.
```
### Runtime Polymorphism in Java

### Example of Java Runtime Polymorphism
```
In this example, we are creating two classes Bike and Splendor. 
Splendor class extends Bike class and overrides its run() method. 
We are calling the run method by the reference variable of Parent class. 
Since it refers to the subclass object and subclass method overrides 
the Parent class method, the subclass method is invoked at runtime.

Since method invocation is determined by the JVM not compiler, 
it is known as runtime polymorphism. 
```

### Upcasting
```
If the reference variable of Parent class refers to the object of Child class, it is known as upcasting. For example:
```

```.java

class Bike{
    public void run(){
    System.out.println("Running...");
    }
}

class Splendor extends Bike{
    public void run(){
    System.out.println("Runing over 60 kmh.");
    }
}

public class Main
{
	public static void main(String[] args) {
	
		Bike bike = new Splendor();
		bike.run();
	}
}

```
```.java
/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*	A real example of Java Method Overriding
	Consider a scenario where Bank is a class 
	that provides functionality to get the rate of interest. 
	However, the rate of interest varies according to banks. 
	For example, SBI, ICICI and AXIS banks could provide 8%, 7%, and 9% rate of interest.
*/

class Bank{
	int getRateOfInterest() {
		return 0;
	}
}

class SBI extends Bank{
	int getRateOfInterest() {
		return 8;
	}
}

class ICICI extends Bank{
	int getRateOfInterest() {
		return 7;
	}
}

class AXIS extends Bank{
	int getRateOfInterest() {
		return 9;
	}
}
public class Main
{
	public static void main(String[] args) {
/*		
        Method Overloading......................
        SBI sbi = new SBI();
		ICICI icici = new ICICI();
		AXIS axis = new AXIS();
		System.out.println("SBI rate of interest : "+sbi.getRateOfInterest());
		System.out.println("ICICI rate of interest : "+icici.getRateOfInterest());
		System.out.println("AXIS rate of interest : "+axis.getRateOfInterest());*/
		// Dynamic dispatch.....................
		Bank bank;  
		bank = new SBI();
		bank = new ICICI();
		bank = new AXIS();
		System.out.println("SBI rate of interest : "+bank.getRateOfInterest());
		System.out.println("ICICI rate of interest : "+bank.getRateOfInterest());
		System.out.println("AXIS rate of interest : "+bank.getRateOfInterest());
	}
}

```



## FAQ
```
1. Can we override java main method?
	No, because the main is a static method.

```
