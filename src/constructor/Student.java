package constructor;

public class Student {
	String nameString;
	int rollno;

	public Student(String nameString, int rollno) {

		this.nameString = nameString;
		this.rollno = rollno;
	}

	public static void main(String[] args) {
		Student s1 = new Student("anik", 101);

	}

}
