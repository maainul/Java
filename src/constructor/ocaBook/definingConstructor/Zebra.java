/**
 * 
 */
package constructor.ocaBook.definingConstructor;

/**
 * @author onik
 *
 */
public class Zebra extends Animal {

	public Zebra(int age) {
		super(age);
		System.out.println("Zebra with constructor");
	}
	
	public Zebra() {
		this(4);
		System.out.println("Zebra without constructor");
	}

}
