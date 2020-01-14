package recursion.Problem3;


//print array using recursion method
/*
	Output:
	Original Array:
	Index 0: 22 
	Index 1: 34 
	Index 2: 21 
	Index 3: 4 
	
	
	Reverse Array:
	Index 3: 4 
	Index 2: 21 
	Index 1: 34 
	Index 0: 22 

*/

public class ReverseArray {
	public static void main(String[] args) {
		int array[] = {22,34,21,4};
		System.out.println("Original Array:");
		for (int i = 0; i < array.length; i++) {
			System.out.println("Index "+i+": "+array[i]+" ");
		}
		
		System.out.println("\n");
		System.out.println("Reverse Array:");
		for (int i = array.length-1; i >= 0; i--) {
			System.out.println("Index "+i+": "+array[i]+" ");
		}
		
	}

}



