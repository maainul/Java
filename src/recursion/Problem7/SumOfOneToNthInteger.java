//Find the sum of the integers from 1 through n.
// Sum of all digit : 38

package recursion.Problem7;

public class SumOfOneToNthInteger
{
	public static void main(String[] args) {
	   int sum = 0;
	   for(int i = 0; i<4;i++){
	       System.out.println("Index" + i+" : "+i);
	       sum = sum + i;
	   }
	    
	    System.out.println("Sum of all digits: "+sum);
	}
	

	
}
