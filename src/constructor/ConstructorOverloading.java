package constructor;

class Test{
	public Test(double x) {
		this(10);
		System.out.println("double");
	}
	public Test(int i) {
		this();
		System.out.println("int");
		// TODO Auto-generated constructor stub
	}
	public Test() {
		System.out.println("no arg");
		// TODO Auto-generated constructor stub
	}
}

public class ConstructorOverloading {

	public ConstructorOverloading() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test obj = new Test(7.5);
		
	}

}
