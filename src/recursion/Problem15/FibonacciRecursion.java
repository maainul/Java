/******************************************************************************

Write a recursive program to print fibonacci series. 1st and 2nd fibonacci numbers are 1, 1.

Input:
6
Output:
1 1 2 3 5 8 

*******************************************************************************/

public class FibonacciRecursion {
    public static void main(String args[]){
       	int x,y,n;
		x = 1;
		y = 1;
		n = 6;
	System.out.print("1 1 ");
	recurs(x,y,n);

}
    
    public static void recurs(int x,int y ,int n){
	int  z;
	if (n > 2){
		z = x+y;
		System.out.print(" "+z); 
		x = y;
		y = z;
		recurs(x, y, n-1);
	}
  }
}
