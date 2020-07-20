package dataStructureAndAlgorithm.array.introduction;

class Student{
	public int roll_no;
	public String nameString;
	
	public Student(int roll_no, String nameString) {
		this.roll_no = roll_no;
		this.nameString = nameString;
	}
	
}


public class _2_ArrayObject {

	public static void main(String[] args) {
		Student[] arr;
		arr = new Student[2];
		
		arr[0] = new Student(1, "mainul hasan");
		arr[1] = new Student(2, "abu");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Element at "+i+" : "+arr[i].roll_no+" "+arr[i].nameString);
		}

	}

}
