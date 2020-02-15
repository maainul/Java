/*
 * Array of ArrayList in Java
We often come across 2D arrays where most of the part 
in the array is empty. Since space is a huge problem, 
we try different things to reduce the space. 
One such solution is to use jagged array when we know 
the length of each row in the array, but the problem 
arises when we do not specifically know the length of
each of the rows.
Here we use ArrayList since the length is unknown.
Following is a Java program to demonstrate the above concept.
 */

package collections.Class.ArrayList;

import java.util.ArrayList;
//Java code to demonstrate the concept of  
//array of ArrayList 

public class _1_Extra_ArrayOfArrayList { 
    public static void main(String[] args) 
    {
    	
        int n = 5; 
  
        // Here al is an array of arraylist having 
        // n number of rows.The number of columns on 
        // each row depends on the user. 
        // al[i].size() will give the size of the 
        // i'th row 
        @SuppressWarnings("unchecked")
		ArrayList<Integer>[] al = new ArrayList[n]; 
  
        // initializing 
        for (int i = 0; i < n; i++) { 
            al[i] = new ArrayList<Integer>(); 
        } 
  
        // We can add any number of columns to each 
        // rows as per our wish 
        al[0].add(1); 
        al[0].add(2); 
        al[1].add(5); 
        al[2].add(10); 
        al[2].add(20); 
        al[2].add(30); 
        al[3].add(56); 
        al[4].add(34); 
        al[4].add(67); 
        al[4].add(89); 
        al[4].add(12); 
  
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < al[i].size(); j++) { 
                System.out.print(al[i].get(j) + " "); 
            } 
            System.out.println(); 
        } 
    } 
} 