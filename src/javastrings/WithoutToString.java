package javastrings;

class WithoutToString {
	int rollno;
	String name;
	String city;

	WithoutToString(int rollno, String name, String city) {
		this.rollno = rollno;
		this.name = name;
		this.city = city;
	}

	public static void main(String args[]) {
		WithoutToString s1 = new WithoutToString(101, "Raj", "lucknow");
		WithoutToString s2 = new WithoutToString(102, "Vijay", "ghaziabad");
		System.out.println(s1);// compiler writes here s1.toString()
		System.out.println(s2);// compiler writes here s2.toString()
	}
}
//javastrings.WithoutToString@4517d9a3
//javastrings.WithoutToString@372f7a8d
