package array;

import java.util.Arrays;
import java.util.Scanner;

public class InputNnumberOfArrayUsingScanner {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of elemnts:");
		int lengthofArray = s.nextInt(); 
		System.out.println("Enter"+ lengthofArray +"elemtnts");
		
		int myarray[] = new int[lengthofArray];
		
		for (int i = 0; i < lengthofArray; i++) {
			myarray[i] = s.nextInt();
		}
		s.close();
		System.out.println(Arrays.toString(myarray));
		Arrays.sort(myarray);
		System.out.println(Arrays.toString(myarray));
	}

}
