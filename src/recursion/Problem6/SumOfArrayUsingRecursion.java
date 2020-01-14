/******************************************************************************

input :  12,5,3,10

Output:
 index 0 :12                                                                                                                
 index 1 :5                                                                                                                 
 index 2 :3                                                                                                                 
 index 3 :10                                                                                                                
Sum of all digits 30   

*******************************************************************************/
package recursion.Problem6;

public class SumOfArrayUsingRecursion
{
	public static void main(String[] args) {
	    int sum = 0;
		reverse(sum,0); 
	}
	
	public static void reverse(int sum,int i){
	    int array[] = {12,5,3,10};
	    System.out.println(" index "+i+" :"+array[i]);
	   
	    sum = sum + array[i];
	     
	    if(i == array.length-1){
	        System.out.println("Sum of all digits: "+sum);
	        return;
	    }else{
	        reverse(sum,i+1);
	    }
	}
}

