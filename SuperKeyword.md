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

	public static void rotateDigit(String[] args) {
		
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

	public static void rotateDigit(String[] args) {
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

	public static void rotateDigit(String[] args) {
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
		// this(rollno,name,course);//reusing constructor  
		this.salary = salary;
	}
	
	void dispay() {
		System.out.println(id+" "+nameString+" "+salary);
	}
}

public class TestSuper5 {

	public static void rotateDigit(String[] args) {
		// TODO Auto-generated method stub
		Emp emp = new Emp(101, "Mainul Hasan", 35000);
		emp.dispay();
	}

}

Output: 101 Mainul Hasan 35000.0

```