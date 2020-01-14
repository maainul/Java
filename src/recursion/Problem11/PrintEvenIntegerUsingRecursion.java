
/******************************************************************************

Problem 11:

Write a  program to print even integers from an array.

Input:
2,4,5,8,10

Output:
4 
8 
10

*******************************************************************************/
package recursion.Problem11;

public class PrintEvenIntegerUsingRecursion
{
	public static void main(String[] args) {
	     int array[] = {7,4,5,8,10};
	     evenNumber(array,0);
	     }
	     
	public static void evenNumber(int[] array,int i){
        if(array[i] %2 == 0){
            System.out.println("Index"+i+" : "+array[i]);
	    }
	    if(i == array.length-1){
	        return;
	    }
	    else{
	        evenNumber(array,i+1);
	    } 
	   }
	    
}
