/*
Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, 
and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:

	Input: [1,2,3]
	Output: [1,2,4]
	Explanation: The array represents the integer 123.
	Example 2:

	Input: [4,3,2,1]
	Output: [4,3,2,2]
	Explanation: The array represents the integer 4321.
	
*/

package dataStructureAndAlgorithm.array;

import java.util.Scanner;

public class PlusOne {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int myarray[] = new int[4];
		
		System.out.println("Enter 5 elemtnts: ");
		for (int i = 0; i < myarray.length; i++) {
			myarray[i] = s.nextInt();
		}
		
		System.out.println("Elemtnts of arrays: ");
		for (int i = 0; i < myarray.length; i++) {
			System.out.print(myarray[i]+ " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("Plus one value :");
		
		// plus one 
		// Leetcode Problem no: 66.
		System.out.println("Array length :"+myarray.length);
		for (int i = 0; i < myarray.length; i++) {
			if(i == myarray.length-1 ) {
				System.out.print((myarray[i]+1)+ " ");
			}
			else {
				System.out.print(myarray[i]+" ");
			}
			
		}
		
		s.close();

	}

}
