/**
 * @Author {Md. Mainul Hasan}
 * 4:04:32 PM
 * Sep 26, 2020
 */
package constructor.ocaBook.compilerEnhanceMent;

public class Child extends Parent{

	public Child(int age) {
		super(age);
		
	}
	
	public Child() {
		super();
		System.out.println("Child constructor");
		
		// TODO Auto-generated constructor stub
	}
	public static void main(String args[]) {
		new Parent(4);
	}

}
