package constructor.ocaBook.constructorOverloading;

public class TestClass {

	private int age;
	private String nameString;

	public TestClass(int age, String nameString) {
		super();
		this.age = age;
		this.nameString = nameString;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	@Override
	public String toString() {
		return "TestClass [age=" + age + ", nameString=" + nameString + "]";
	}

}
