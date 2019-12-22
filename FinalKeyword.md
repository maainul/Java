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