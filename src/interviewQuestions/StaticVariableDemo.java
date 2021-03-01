package interviewQuestions;





class Student {
	String collegeName = "IUBAT";
	int age;
	String name;

	public Student(int age, String name) {

		this.age = age;
		this.name = name;
	}
	
	static {
		System.out.println("Static block");
	}
	


	@Override
	public String toString() {
		return "Student [collegeName=" + collegeName + ", age=" + age + ", name=" + name + "]";
	}

}

public class StaticVariableDemo {

	public static void main(String[] args) {
		Student student1 = new Student(10, "Poltu");
		Student student2 = new Student(10, "Poltu");
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		

	}

}
