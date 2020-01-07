package collectionsInJava;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
	String nameString;
	int roll;
	int age;
	
	public Student(String nameString, int roll, int age) {
		this.nameString = nameString;
		this.roll = roll;
		this.age = age;
	}
}

public class UserDefinedClassObjectsinJavaArrayList {

	public static void main(String[] args) {
		// create user defined class object
		Student s1 = new Student("Mainul",12,22);
		Student s2 = new Student("Hasan",2,25);
		Student s3 = new Student("Manik",1,20);
		ArrayList<Student> list = new ArrayList<Student>();
		// create array list
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		// getting iterator
		Iterator<Student> itrIterator = list.iterator();
		while(itrIterator.hasNext()) {
			Student str = (Student)itrIterator.next();
			System.out.println(str.nameString+" "+str.roll+" "+str.age);
			
			
		}

	}

}
