package dataStructureAndAlgorithms.Array;

public class Main {

	public static void main(String[] args) {
		Array practice = new Array();
		// insert value to the array...
		practice.insertArray(54);
		practice.insertArray(43);
		practice.insertArray(98);
		practice.insertArray(98);
		practice.insertArray(101);
		System.out.print("Original array is: ");
		practice.show();
		// insert value using positon...
		//practice.insertAt(2, 10);
	  //  System.out.print("After inserting elements value is :");
	//	practice.show();
		// delete using value
		//practice.delete(71);
	   // practice.delete(12);
		//System.out.println("After delete value elements are: ");
		//practice.show();
		//delete by index number
	//	practice.deleteAt(1);
	//	practice.show();
	//	practice.deleteAt(0);
	//	practice.show();
		//search by value...
	practice.search(54);
		practice.show();
		System.out.println();
		practice.removeDuplicate();
		//practice.show();
		
				

	}

}

/*
Output:
	Original array is: 89 71 12 7 
	After inserting elements value is :89 71 10 7 
	Delete successfully
	Elemnet is not found...
	After delete value elements are: 
	89 10 7 0 
	Delete successfully
	89 7 0 0 
	Delete successfully
	7 0 0 0 
	Element 7 is present in the index number: 0
	7 0 0 0 
*/
