# Constructor

## 01.Java Constructors Need of Constructor by Durga Sir


```.java
package constructor;

public class Student {
		String nameString;
		int rollno;
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();

	}
}
```

Everytime we create object instace variable will be created and default value will be provided.
suppose you have 200 student then 200 instance variable will be crated and default value 
will initialize.

![Screenshot from 2020-08-11 07-21-01](https://user-images.githubusercontent.com/37740006/89847187-1e243e80-dba5-11ea-90f3-83f9e97026bb.png)

All Student will have same name null and roll 0

#### Constructor jab is to perform initialization of object.

```.java
package constructor;

public class Student {
		String nameString;
		int rollno;
	
		public Student(String nameString, int rollno) {
		
			this.nameString = nameString;
			this.rollno = rollno;
		}
		
	}
	

	public static void main(String[] args) {
		Student s1 = new Student("anik",101);
		Student s1 = new Student("mnik",102);
		Student s1 = new Student("snik",103);

	}

}
```
### Let's break down constructor

```.java

		public Student(String nameString, int rollno) {
		
			this.nameString = nameString;
			this.rollno = rollno;
		}
```
```.java
Student s1 = new Student("anik",101);
```
### What happend in this line

1. new - create object with the default value

![Screenshot from 2020-08-11 07-29-47](https://user-images.githubusercontent.com/37740006/89847218-35632c00-dba5-11ea-8996-be088da77e28.png)

2. Student("Anik",101) - initialize value

![Screenshot from 2020-08-11 07-29-25](https://user-images.githubusercontent.com/37740006/89847227-41e78480-dba5-11ea-8ee5-366620989a9d.png)

3. s1 - create a reference variable

![Screenshot from 2020-08-11 07-28-36](https://user-images.githubusercontent.com/37740006/89847244-4ca21980-dba5-11ea-8d18-47f182a6f4db.png)

### EveryTime constructor will called

```.java
package constructor;

public class _1_EveryTimeConstructorCall {

	public _1_EveryTimeConstructorCall() {
		System.out.println("Constructor call");
	}

	public static void main(String[] args) {
		_1_EveryTimeConstructorCall obj1 = new _1_EveryTimeConstructorCall();
		_1_EveryTimeConstructorCall obj2 = new _1_EveryTimeConstructorCall();
		_1_EveryTimeConstructorCall obj3 = new _1_EveryTimeConstructorCall();

	}

}


Constructor call
Constructor call
Constructor call

```

Question : What is constructor ?
Answer : A constructor is method that is responsible for initialize the object variable

Question : How to write constructot ?
Answer : public Test()
			{
	
			}

Question : when the constructor will execute ?
Answer : when we create object this time constructor will execute

Question : What is the purpose of constructor ?
Answer : Initialize object

## 2.Rules of Constructor:

1. Name of the construtor and name of the class will be same.

2. No return type.

3. Modifiers : public,private,protected and default
	
			public - anywhere you can create object.

			private - within that class you can crate object.

			default - within same package you can create object.

			protect - within same package and child class.

## Can we create a methiod same as class name.

yes 

```.java
class Test{
	void Test(){
		sout("hello");
	}
	psvm(String args[]){
		Test ob = new Test();
		Test ob2 = new Test();
	}
}

// no error will be happend because compiler treated Test as a method.
But it is not recommended  practice.
```

## 3.Default constructor

Every class contains constructor

Compiler is responsible for create default constructor

If you are not writting any constructor compiler will generate
default constructor.

Abstract class contains constructor

## Prototype of default constructor

1. It is always no arg constructor

2. Access modifier of default is same as class modifier.

if class public default constructor public.
if class private default constructor private.

3. default constructor contains only one line super

## 4.Various cases of super and this

First line of default constructor in super() or this()

case 1 : use super() only first line

```.java

class Test{
	Test(){
		sout("const");
		super(); // error
	}
}


```

case 2 : can't use both super() and this().you have to use either super or this.
```.java

class Test{
	Test(){
		this(); // error
		sout("const");
		super(); // error
	}
}


```
case 3 : can't use super in the method. only in constructor
```.java

class Test{
	public void m1(){
		sout("hello");
		super(); // error
	}
}


```

# 5.Difference Between Super(), super, this() and this.

## Use of Super and this

super call parent class variable.

this keyword call the child class/current class variable.

```.java
package constructor;

class P {
	String string = "Parent";
}

class C extends P {
	String string = "Child";

	public void m1() {
		System.out.println(string); // child
		System.out.println(this.string); // child
		System.out.println(super.string); // parent
	}
}

public class SuperAndThis {

	public static void main(String[] args) {
		C obj = new C();
		obj.m1();

	}

}
Child
Child
Parent
```
### Super(), this():

1. These are constructor calls to call super and current class constructor.

2. we can use only in constructor as first statement only.

3. We can use only one but not both simontenwously.


### Super, this:

1. These are keyword  to refer super class  and current class instance members.

2. we can use anywhere except static area.

3. We can use both simontenwously.

## 6.Constructor overloading

```.java
package constructor;

class Test{
	public Test(double x) {
		this(10);
		System.out.println("double");
	}
	public Test(int i) {
		this();
		System.out.println("int");
		// TODO Auto-generated constructor stub
	}
	public Test() {
		System.out.println("no arg");
		// TODO Auto-generated constructor stub
	}
}

public class ConstructorOverloading {

	public ConstructorOverloading() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test obj = new Test(7.5);
		
	}

}

no arg
int
double
```

# Parents and child called by super()

```.java
package constructor;

class Parent{
	public Parent() {
		
	}
}
class Child extends Parent{
	
}

}
```
