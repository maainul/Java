package oopConcept.encapsulation;

class Student {
	private int rollno;
	private String nameString;
	private String idNumberString;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public String getIdNumberString() {
		return idNumberString;
	}

	public void setIdNumberString(String idNumberString) {
		this.idNumberString = idNumberString;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", nameString=" + nameString + ", idNumberString=" + idNumberString + "]";
	}

}

public class Main {

	public static void main(String[] args) {
		Student obj = new Student();

		obj.setRollno(10);
		obj.setNameString("anik");
		obj.setIdNumberString("1510225887441");
		System.out.println(obj.toString());

	}

}
