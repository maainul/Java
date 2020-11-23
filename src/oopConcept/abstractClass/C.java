package oopConcept.abstractClass;

public class C extends P{
	public void m2() {
		System.out.println("child m2");
	}
	
	public static void main(String[] args) {
		P p = new C();
		p.m1();
	}

}
