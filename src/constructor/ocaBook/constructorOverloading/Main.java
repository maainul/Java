package constructor.ocaBook.constructorOverloading;

public class Main {
	public static void main(String args[]) {
		Hamstar obj = new Hamstar(10);
		System.out.println(obj.getWeight());
		Hamstar obj2 = new Hamstar(100, "blue");
		System.out.println(obj2.getColor());
		System.out.println(obj2.getWeight());

		TestClass objClass = new TestClass(26, "anik");
		System.out.println(objClass.toString());
	}

}
