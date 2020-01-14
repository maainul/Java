/******************************************************************************

Problem 10:

Write a  program to print even integers from an array.

2,4,5,8,10
Output:
2 4 8 10


*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	     int array[] = {2,4,5,8,10};
	     for(int i = 0; i<array.length;i++){
	         if(array[i] %2 == 0){
	             	System.out.println("Index"+i+" : "+array[i]);
	         }
	         
	     }
	
	}
}
