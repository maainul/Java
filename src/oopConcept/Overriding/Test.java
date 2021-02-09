package oopConcept.Overriding;

class P {
	public void m1(int i) {
		System.out.println("parent Int call");
	}

	public void m2(float f) {
		System.out.println("Parent float call");
	}

	public void m3(double d) {
		System.out.println("parent double");
	}

}

class C extends P {
	@Override
	public void m1(int i) {
		System.out.println("Child int call");
	}

	@Override
	public void m2(float f) {
		System.out.println("Child float call");
	}

}

class D extends P {

}

public class Test {

	public static void main(String[] args) {
		// parent obj and parent reference
//		P p = new P();
//		p.m1(10);
//		p.m2(10.5f);
//		
//		// child object child object
//		C c = new C();
//		c.m1(20);
//		c.m2(20.5f);
//		c.m3(30.44d);

		// child object Parent reference
		P p1 = new C();
		p1.m1(30);
		p1.m2(12.5f);
		p1.m3(45.5d);
		// 1st compliler check m3 method in the parent class.
		// if m3 is not present in the parent class it will
		// throw an error
		// if present then JVM execute the next part
		// child class exists m3 then print the result.

		// parent object child reference
		// C c1 = new P();

	}

}
