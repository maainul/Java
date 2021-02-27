# :+1: Inheritance
```
One object acquires all the properties and behaviour of a parent object.
  1. we can create new class that are built upon existing classes.
  2. We can reuse methods and fields of the parent class.
  3. We can add new methods and fields in the current class.
  
Inheritance represents the IS-A relationship which is also known as a parent-child relationship. 
```
### Why use inheritance in java?
```
  1. For Method Overriding (so runtime polymorphism can be achieved).
  2. For Code Reusability.
```
### Terms used in Inheritance
```
Class: A class is a group of objects which have common properties. 
It is a template or blueprint from which objects are created.

Sub Class/Child Class: Subclass is a class which inherits the other class. 
It is also called a derived class, 
extended class, or child class.

Super Class/Parent Class: Superclass is the class from where a subclass inherits the features. 
It is also called a base class or a parent class.

Reusability: As the name specifies, reusability is a mechanism which facilitates 
you to reuse the fields and methods of the existing class when you create a new class. 
You can use the same fields and methods already defined in the previous class.
```
#### 2.1. Basic Inheritance (The relationship between the two classes is Programmer IS-A Employee.It means that Programmer is a type of Employee.) 

```.java
class Empolyee{
    float salary = 4000f;
    
    public void salary(){
    System.out.println("Employee class salary : "+salary);
	}
}

class Programmer extends Empolyee{
    int bonus = 1000;
    
    public void bonus(){
    System.out.println("Program  class bonus : "+bonus);
	}
}

public class Main
{
	public static void rotateDigit(String[] args) {
	    //Empolyee e = new Empolyee();
	    //e.salary();
	   Programmer e = new Programmer();
	    e.salary();
	    e.bonus();

	}
}

Output:

Employee class salary : 4000.0                                                                                        
Program  class bonus : 1000  
```
### Multiple Inheritance
```.java
class Animal{
    void eat(){
        System.out.println("eating...");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("barking...");
    }
}

class BabyDog extends Dog{
    void weep(){
        System.out.println("Weeping");
    }
}

public class Main
{
	public static void rotateDigit(String[] args) {
	    BabyDog d = new BabyDog();
	    d.eat();
	    d.bark();
	    d.weep();
	    
		
	}
}

Output:

eating...                                                                                                             
barking...                                                                                                            
Weeping  
```
### Multilevel Inheritance

```.java
class Animal{
    void eat(){
        System.out.println("Eating....");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("barking dog...");
    }
}

class Cat extends Animal{
    void meow(){
         System.out.println("Meowing cat ");
    }
   
}
public class Main
{
	public static void rotateDigit(String[] args) {
	    Cat c = new Cat();
	    c.meow();
	    c.eat();
	    c.bark(); // error .. C.T. Error
	}
}
```
## Q) Why multiple inheritance is not supported in java?
```
To reduce the complexity and simplify the language, multiple inheritance is not supported in java.

Consider a scenario where A, B, and C are three classes. The C class inherits A and B classes. 
If A and B classes have the same method and you call it from child class object, 
there will be ambiguity to call the method of A or B class.

Since compile-time errors are better than runtime errors, 
Java renders compile-time error if you inherit 2 classes. 
So whether you have same method or different, 
there will be compile time error.
```
```.java
class A{
    void msg(){
        System.out.println("Hello A");
    }
}

class B {
    void msg(){
        System.out.println("Hello B");
    }
}

class C extends A,B { // suppose if it were
    
}
public class Main
{
	public static void rotateDigit(String[] args) {
	    C obj = new C();
	    obj.msg();
		//System.out.println("Hello World");
	}
}

Output:
Compile Time Error
```
