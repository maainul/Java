package oopConcept.abstractClass.abstractClassVsAbstractMethod;

abstract class Test {
	public abstract void m1();

	public abstract void m2();
}

abstract class SubTest extends Test {
	public void m1() {
		System.out.println("m1 method.");
	}
}

class SubSubTest extends Test {
	@Override
	public void m1() {
		System.out.println("m1 child");

	}

	public void m2() {
		System.out.println("m2 method from child");
	}

}

public class Main {

	public static void main(String[] args) {
		SubSubTest obj = new SubSubTest();
		obj.m1();
		obj.m2();

	}

}
