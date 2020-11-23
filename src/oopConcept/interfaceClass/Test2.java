package oopConcept.interfaceClass;

interface Inter {
	public abstract void m1();

	public abstract void m2();

}

abstract class ServiceProviderr implements Interf {
	public void m1() {
		System.out.println("m1 method from abstract class");
	}
}

class SubServiceProvider extends ServiceProviderr {
	public void m2() {
		System.out.println("m2 from class");
	}
}

public class Test2 {

	public static void main(String[] args) {
		SubServiceProvider oProvider = new SubServiceProvider();
		oProvider.m1();
		oProvider.m2();

	}

}
