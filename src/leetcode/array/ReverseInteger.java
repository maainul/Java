package leetcode;

public class ReverseInteger{

    public static void main(String args[]) {
        int x = 4236469;
        int output = reverseInteger(x);
        System.out.println("Input : " + x + " Output : " + output);
    }

    	public static int reverseInteger(int x) {
    	      boolean negative = false;
    	        if(x < 0){
    	            negative = true;
    	            x = x * -1;
    	        }
    	        
    	        long rev = 0;
    	        
    	        while(x > 0){
    	            rev = (rev*10)+(x%10);
    	            x = x/10;
    	        }
    	        
    	        if(rev > Integer.MAX_VALUE){
    	            return 0;
    	        }
    	        
    	        return negative ? (int)(rev*-1) : (int)(rev);
    	    }
    	}
 
  
        

