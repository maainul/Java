package dataStructureAndAlgorithm._1_array;

/**************************************************
283. Move Zeroes (Easy)

Given an array nums, write a function to move all 0's to the end 
of it while maintaining the relative order of the non-zero elements.

	Example:
	
	Input: [0,1,0,3,12]
	Output: [1,3,12,0,0]

Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.
 ********************************************************/

import java.util.Arrays;
import java.util.Collections; 

public class ArraySorting 
{ 
    public static void main(String[] args) {
    
    int[] arr = {13, 7, 6, 45, 21, 9, 2, 100}; 
    
    // Note that we have Integer here instead of 
    // int[] as Collections.reverseOrder doesn't 
    // work for primitive types. 
    //Integer[] nums = {13, 7, 6, 45, 21, 9, 2, 100}; 
    
    Integer[] nums = {13, 7, 6, 45, 21, 9, 2, 100}; 
    System.out.println("Original Array :"+Arrays.toString(arr));	
    asscendingOrder(arr);
    modifiedOrder(arr);
    descendingOrder(nums);
	alphabeticOrder();
	

 } 
    
    
  	private static void alphabeticOrder() {
    	String arr[] = {"practice.geeksforgeeks.org", 
                "quiz.geeksforgeeks.org", 
                "code.geeksforgeeks.org"
               }; 

	// Sorts arr[] in ascending order 
	Arrays.sort(arr); 
	System.out.printf("\nModified arr[] : \n%s\n\n",Arrays.toString(arr)); 
	
	// Sorts arr[] in descending order 
	Arrays.sort(arr, Collections.reverseOrder()); 
	
	System.out.printf("Modified arr[] : \n%s\n\n", Arrays.toString(arr)); 
		
	}



	private static void descendingOrder(Integer[] nums) {
    	// Note that we have Integer here instead of 
        // int[] as Collections.reverseOrder doesn't 
        // work for primitive types. 
        //Integer[] nums = {13, 7, 6, 45, 21, 9, 2, 100}; 
  
        // Sorts arr[] in descending order 
        Arrays.sort(nums, Collections.reverseOrder()); 
  
        System.out.printf("\nModified arr[] :"+Arrays.toString(nums)); 
		
	}



	private static void modifiedOrder(int[] arr) {
    	// Sort subarray from index 1 to 4, i.e., 
        // only sort subarray {7, 6, 45, 21} and 
        // keep other elements as it is. 
        Arrays.sort(arr, 1, 5); 
  
        System.out.printf("Modified array : "+Arrays.toString(arr)); 
		
	}



	private static void asscendingOrder(int[] arr) {
    	// Our arr contains 8 elements 
        Arrays.sort(arr); 
        System.out.println("Asscending Order:"+Arrays.toString(arr));
        
    }
}