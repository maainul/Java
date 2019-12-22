# What id Binding?

```
Binding refers to the linking between method call and method defination.


```
# Example of Binding:

```.java

public class A{
	void m1() {
		System.out.println("this is m1");
	}
	void m2() {
		System.out.println("this is m2");
	}

public static void main(String args[]){
	A obj = new A();
	// assing object and method together is called binding.
	// we bind the object with method to get result.
	obj.m1();
	obj.m2();
	}
}

```
# Difference between Static and Dynamic binding.
```
# Static Binding
	> It resolved at the compiler time by the compiler.
	> ALso called early binding.
	> Binding happens before a program actually runs.
	> Example: Method Overloading.

# Dynamic Binding:
	> Compiler is not able to resolve the binding at the compiler time.
	> Also called late binding.
	> Binding happens during runtime.
	> Example: method overriding.
```
# Example of Static Binding:

```.java

class Test{
	
	void area(float r) {
		float a;
		a = 3.1416f *r;
		System.out.println("Area of a circle: "+a);
	}
	
	void area(float l, float b) {
		float a;
		a = l*b;
		System.out.println("Area of a rectangle: "+a);
	}
	
}

public class StaticBinding {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test obj1 = new Test();
		obj1.area(345.4f);
		obj1.area(23.23f,45.6f);

	}

}

Output:

Area of a circle: 1085.1086
Area of a rectangle: 1059.288

```
# Example Dynamic Binding

```
class Shape{
	void draw() {
		System.out.println("No shape...");
	}
}

class Rectangle extends Shape{
	void draw() {
		System.out.println("This will draw rectangle...");
	}
}

class Circle extends Shape{
	void draw() {
		System.out.println("It will draw circle...");
	}
}

class Triangle extends Shape{
	void draw() {
		System.out.println("it is triangle part...");
	}
}

public class DynamicBinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s; // s is a reference variable of Shape
		s = new Shape();
		s.draw();
		// assign reference variable s in the Rectangle class.
		s = new Rectangle();
		s.draw();
		// assign reference variable s in the Circle class.
		s = new Circle();
		s.draw();
		// assign reference variable in the Triangle class.
		s = new Triangle();
		s.draw();
	}

}

Output: 

No shape...
This will draw rectangle...
It will draw circle...
it is triangle part...


```

# Runtime polymorphism with data members

```.java
class A{
	int i = 10;
}
class B extends A{
	int i = 20;
}
public class DataMembers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a;
		a = new A();
		a = new B();
		System.out.println(a.i);
	}

}

10
```
# Example multilevel Dynamic Binding 
```.java
class AA{
	void m1() {
		System.out.println("this is A m1");
	}
}
class BB extends AA{
	void m1() {
		System.out.println("this is B m1");
	}
}
class C extends BB{
	void m1() {
		System.out.println("this is C m1");
	}
}
public class MultilevelWithRuntimeTest {
	
	public static void main(String[] args) {
		 AA a; 
		 a = new AA(); 
		//AA a1 = new AA(); 
		 a = new BB();
		//AA a2 = new BB();
		 a = new C(); 
		//AA a3 = new C();
		 a.m1();
		 a.m1();
		 a.m1();

	}

}

Output:
	this is C m1
	this is C m1
	this is C m1

```