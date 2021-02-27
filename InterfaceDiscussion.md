# Intrface 

# Defination of Interface
```
	-A interface is basically a kind of class.
	-Like class interface contain method and variable.
	-The difference of class and interface is, 
	Interface define only abstrace method and final field.
	That means interface do not specify any code to implement these methods 
	-And data fields contain only constant.

Interface cannot extends classes.
```
# Syntax 

```.java
interface interfacename{

	// declare constant fields  
    // declare methods that abstract   
    // by default.

}
```
# Real syntax

```.java
interface item{
	1. static final int code = 1001;
	   static final String name = "mainul";
	2. void display();
}

1. All variable are declared as constant.
2. Method declaration will contain only a list of methods
without any body statement.
```

# Why use Java interface?
```
There are mainly three reasons to use interface. They are given below.

	1. It is used to achieve abstraction.
	2. By interface, we can support the functionality of multiple inheritance.
	3. It can be used to achieve loose coupling.
```

```
The Java compiler adds public and abstract keywords before the interface method. 
Moreover, it adds public, static and final keywords before data members.
```

# Difference between class and interface

```
# class:
	1.The member of a class can be constant or variable.
	2.The class defination can contain the code for 
	each method. That is,the member can be abstract or
	non-abstract.
	3.It can be instantiated by declaring objects.
	5.It can use any kinds of access modifires.
	public,private and protected.

# Interface:
	1.The member of a Interface always constant or value is final.
	2.The Interface defination can not contain the code for 
	each method. That is,the member IS abstract.
	3.It can not be used to declar objects.It can only inherited by a class
	5.It can use only public access modifires.
```
# Extending interface

```.java

interface IntemConstants{
	//All variable in the interface are treated as a constant 
	//although the keyword final and static are not present.
	int code = 1001;
	String name = "light";
}

interface Item extends ItemConstants{
	void display();
}
```

interface Item extends ItemConstants

# Combined several interface together
```.java

interface IntemConstants{
	//All variable in the interface are treated as a constant 
	//although the keyword final and static are not present.
	int code = 1001;
	String name = "light";
}

interface ItemMethods{
	void display();
}

interface Item extends ItemConstants,ItemMethods{
	------
	------
}
```
# Implementing iterfaces
```.java
1. interfaces are used as a superclass whose properties
are inherited by classes.

package basicexample;

interface Area{
	final static float pi = 3.1416f;
	float compute (float x, float y);
}

class Rectangle implements Area{   // interface implemented
	public float compute(float x, float y) {
		return (x*y);
	}
}

class Cicle implements Area{ // another interface implemented
	public float compute(float x, float y) {
		return (pi*x*y);
	}
}


public class InterfaceTest {

	public static void rotateDigit(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle();
		Cicle cir = new Cicle();
		Area area;
		area = rect;
		System.out.println("Area of rectangle: "+ area.compute(10, 20));
		
		area = cir;
		System.out.println("Area of rectangle: "+ cir.compute(10, 20));
	
	}

}

Output: 
Area of rectangle: 200.0
Area of rectangle: 628.31995

```

# Java Interface Example: Drawable

```.java


interface Drawable{
	void draw();
}

class Ractangle implements Drawable{
	public void draw(){
		System.out.println("It will draw circle...");
	}
}


class Circel implements Drawable{
	public void draw() {
		System.out.println("It will draw circle...");
	}
}

public class InterfaceShape {

	public static void rotateDigit(String[] args) {
		Drawable drawable = new Circel(); {
		drawable.draw();
				
			}
		

	}

}

Output:
It will draw circle...

```
# Java Interface Example: Bank

```.java

interface Bank{
	float rateofInterest();
}

class SBI implements Bank{
	public float rateofInterest() {
		return 9.15f;
	}
}

class PNB implements Bank{
	public float rateofInterest() {
		return 9.7f;
	}
}



public class TestInterface2 {

	public static void rotateDigit(String[] args) {
		Bank bank = new SBI();
		System.out.println("Rate of interest: "+ bank.rateofInterest());

	}

}

Output:

	ROI: 9.15

```

# Java 8 Default Method in Interface
```.java

interface DraWAble{  
	void draw();  
	default void msg(){System.out.println("default method");}  
}

class Retangle implements DraWAble{  
	public void draw(){System.out.println("drawing rectangle");}  
}  

class DefaultMethod{  
	public static void rotateDigit(String args[]){  
		DraWAble d=new Retangle();  
		d.draw();  
		d.msg();  
	}
}  

Output:
	drawing rectangle
	default method

```
# Java 8 Static Method in Interface

```.java
Since Java 8, we can have static method in interface. Let's see an example:


interface Drawable{  
	void draw();  
	static int cube(int x){return x*x*x;}  
}  

class Rectangle implements Drawable{  
	public void draw(){
		System.out.println("drawing rectangle");
	}  
}  
  
class TestInterfaceStatic{  
	public static void rotateDigit(String args[]){  
	Drawable d=new Rectangle();  
	d.draw();  
	System.out.println(Drawable.cube(3));  
	}
}  

Output:
	drawing rectangle
	27

```
	