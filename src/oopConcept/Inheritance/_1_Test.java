package oopConcept.Inheritance;

class P {
	public void m1() {
		System.out.println("Parent");
	}
}

class C extends P {
	public void m2() {
		System.out.println("Child");
	}
}

public class _1_Test {

	public static void main(String[] args) {

		// 1. parent reference and parent obj
		P p = new P();
		p.m1();
		// p.m2(); // compiler error

		// 2 . Child class and Child object
		C c = new C();
		c.m1();
		c.m2();

		// parent reference and child obj)
		P pa = new C();
		pa.m1();

		// child reference and parent obj.
		// C cc = new P(); // error
		// p.m1();
		// p.m2(); // compiler error

	}

}
