//Find the sum of the integers from 1 through n.
// sum of integers :10

public class SumOfIntegerFromOneToNthUsingRecursion
{
	public static void main(String[] args) {
	   int sum = 0;
       sumofarray(sum,0,4);
	   }
	   
	public static void sumofarray(int sum,int i,int end){
	    sum = sum+i;
	    if(i == end){
	        System.out.println("sum of integers :"+sum);
	        return;
	    }
	    else{
	         sumofarray(sum,i+1,end);
	    }
	  
	}
	   
}
	
