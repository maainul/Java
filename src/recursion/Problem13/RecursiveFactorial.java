/******************************************************************************

Write a recursive program to compute n!
Input:
5
Output:
120

*******************************************************************************/
public class Main{
	public static void main(String[] args) {
	   int fact = 1;
       factorial(fact,1,4);
	   }
	   
	public static void factorial(int fact,int i,int end){
	    fact = fact*i;
	    if(i == end){
	        System.out.println("Factorial :"+fact);
	        return;
	    }
	    else{
	         factorial(fact,i+1,end);
	    }
	  
	}
	   
}
