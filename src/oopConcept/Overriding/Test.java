package oopConcept.Overriding;

class P{
	public void m1(int i) {
		System.out.println("parent Int call");
	}
	public void m2(float f) {
		System.out.println("Parent float call");
	}
}
class C extends P{
	public void m1(int i) {
		System.out.println("Child int call");
	}
	
	public void m2(float f) {
		System.out.println("Child float call");
	}
	
}

public class Test {

	public static void main(String[] args) {
		// parent obj and parent reference
		P p = new P();
		p.m1(10);
		
		// child object child object
		C c = new C();
		c.m1(20);
		
		// child object Parent reference
		P p1 = new C();
		p1.m1(30);
		
		// parent object child reference
		//C c1 = new P();
		
		
		
	}

}
