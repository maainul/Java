package leetcode.array;

class Number{
	 int x;
	 public void reverseInteger(int x) {	        
	        long rev = 0;
	        long n = x;
	        
	        while(n > 0){
	            rev = (rev*10)+(n%10);
	            n = n/10;
	        }
	        
	        
	        if(x == rev) {
	        	System.out.println(rev);
	        	System.out.println("palindrom"); 	

	        }
	        else {
				System.out.println("Not a palindrom");
			}
	    }
}



public class PalindromNumber {

	public static void main(String args[]) {
       Number number = new Number();
       number.reverseInteger(00100);
    }
   }
 


