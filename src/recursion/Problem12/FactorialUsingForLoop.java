/******************************************************************************

Write a recursive program to compute n!
Input:
5
Output:
120

*******************************************************************************/
package recursion.Problem12;

public class FactorialUsingForLoop{
	public static void main(String[] args) {
	   int i,fact = 1;
	   
	   for(i = 5; i > 0; i--){
	       fact = fact *i;
	   }
	   System.out.println("Factorial :"+fact);
	}
}
