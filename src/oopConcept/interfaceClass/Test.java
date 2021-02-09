package oopConcept.interfaceClass;

/* 
 Rules for Interface
 	0. only public, abstract, default, static and strictfp for method
 	1. method should be abstract
 	2. variable should be initialized.
 	3. can't create variable
 	4. if you don't want to implement all methods two option is there:
 			1. make class abstract
 			2. implement all method
 */

interface Interf {
	public int x = 0;

	public abstract void m1();

	public abstract void m2();
}

class ServiceProvider implements Interf {
	@Override
	public void m1() {
		System.out.println("m1 method");
	}

	@Override
	public void m2() {
		System.out.println("m2 method");

	}
}

public class Test {

	public static void main(String[] args) {
		ServiceProvider obj = new ServiceProvider();
		obj.m1();
		obj.m2();

	}

}
