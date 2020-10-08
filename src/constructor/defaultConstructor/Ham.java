/**
 * @Author Md. Mainul Hasan
 * 
 * 12:48:49 PM
 * 
 * Sep 28, 2020
 *
 */
package constructor.defaultConstructor;

public class Ham {
	private int weight;
	@SuppressWarnings("unused")
	private String color;

//	public Ham(int weight) {
//		super();
//		this.weight = weight;
//	}

	public Ham(int weight, String color) {
		super();
		this.weight = weight;
		this.color = color;
		System.out.println("any");
	}

//	public Ham(int weight) {
//		System.out.println(new Ham(weight, "Brown"));
//	}

	public static void main(String[] args) {
		Ham obj = new Ham(10);
		 System.out.println(obj.weight);
		System.out.println(obj);

	}

	public Ham(int weight) {
		this(weight,"Brown");
	}

}
