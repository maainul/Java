package interviewQuestions;

class ToStringMethod {
	int rollno;
	String name;
	String city;

	ToStringMethod(int rollno, String name, String city) {
		this.rollno = rollno;
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {// overriding the toString() method
		return rollno + " " + name + " " + city;

	}

	public static void main(String args[]) {
		ToStringMethod s1 = new ToStringMethod(101, "Raj", "lucknow");
		ToStringMethod s2 = new ToStringMethod(102, "Vijay", "ghaziabad");
		System.out.println(s1);// compiler writes here s1.toString()
		System.out.println(s2);// compiler writes here s2.toString()
	}
}

//101 Raj lucknow
//102 Vijay ghaziabad

//javastrings.WithoutToString@4517d9a3
//javastrings.WithoutToString@372f7a8d
