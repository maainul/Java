package oopConcept.memberModifiers.priotectedModifier;

class A{
	//private void m1() {
	void m1() {
		System.out.println("A private");
	}
}

public class Test {
	public static void main(String args[]) {
		A obj = new A();
		obj.m1();
	}
	
}
