package recursion.Problem17;

public class PrimeNumber{    
	 public static void main(String args[]){    
		 	int num = 0;
	        boolean flag = false;
	       
	        if(num == 0 || num == 1) {
	        	flag = true;       	
	        }else {
	 
	        for(int i = 2; i <= num/2; ++i)
	        {
	            // condition for nonprime number
	            if(num % i == 0)
	            {
	                flag = true;
	                break;
	            }
	        }
	    } 
	        if (!flag)
	            System.out.println(num + " is a prime number.");
	        else
	            System.out.println(num + " is not a prime number.");
	 }
}    
   	
	

