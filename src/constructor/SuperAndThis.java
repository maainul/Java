package constructor;

class P {
	String string = "Parent";
}

class C extends P {
	String string = "Child";

	public void m1() {
		System.out.println(string);
		System.out.println(this.string);
		System.out.println(super.string);
	}
}

public class SuperAndThis {

	public static void main(String[] args) {
		C obj = new C();
		obj.m1();

	}

}
