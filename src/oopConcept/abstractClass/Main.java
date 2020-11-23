package oopConcept.abstractClass;

abstract class Parent {
	public abstract void m1();

	public abstract void m2();

	public abstract void m3();
}

abstract class Child extends Parent {
	public void m1() {
		System.out.println("m1");
	}

}

class SubClass extends Child{

	@Override
	public void m2() {
		System.out.println("m2");
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("m3");
		
	}
	
}

public class Main {

	public static void main(String[] args) {
		SubClass child = new SubClass();
		child.m1();
		child.m2();
		child.m3();
	}

}
