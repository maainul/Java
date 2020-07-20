package dataStructureAndAlgorithm._1_array;

import java.util.Arrays;
import java.util.Comparator;

class Student{
	int rollno;
	String nameString;
	String addressString;
	
	public Student(int rollno, String nameString, String addressString) {
		
		this.rollno = rollno;
		this.nameString = nameString;
		this.addressString = addressString;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", nameString=" + nameString + ", addressString=" + addressString + "]";
	}
	

	
	
}

class Sortbyroll implements Comparator<Student>{
	public int compare(Student a, Student b) {
		return a.rollno - b.rollno;
	}
}

public class sortAnArrayAccordingToUserDefinedCriteria {

	public static void main(String[] args) {
		Student [] arr = {new Student(111, "bbbb", "london"), 
                new Student(131, "aaaa", "nyc"), 
                new Student(121, "cccc", "jaipur")}; 
		
		 System.out.println("Unsorted"); 
	        for (int i=0; i<arr.length; i++) 
	            System.out.println(arr[i]); 
	        
	        
	       Arrays.sort(arr, new Sortbyroll()); 
	
	        System.out.println("\nSorted by rollno"); 
	        for (int i=0; i<arr.length; i++) 
	            System.out.println(arr[i]); 
	        

	}

}
