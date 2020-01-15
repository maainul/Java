package recursion.Problem16;

public class Fibonacci {
    public static void main(String args[]){
       	int x,y,n;
		x = 1;
		y = 1;
		n = 8;
	recurs(x,y,n);

}
    
    public static void recurs(int x,int y ,int n){
	int  z;
	if (n > 2){
		z = x+y;
		x = y;
		y = z;
		if(n == 4) {
			System.out.print(" "+z); 
		}
		recurs(x, y, n-1);
	}
  }
}