package array.recursion.Problem4;


//print array using recursion method
/*
	Index7 : 7
	Index6 : 45
	Index5 : 0
	Index4 : 98
	Index3 : 8
	Index2 : 9
	Index1 : 5
	Index0 : 2

*/

public class ReverseArrayUsingRecursion {
		public static void main(String[] args) {
		    int array[] = {2,5,9,8,98,0,45,7};
		    int i = array.length;
		    reverse(array,i-1);
	}
	private static void reverse(int[] array, int i) {
		System.out.println("Index"+i+" : "+array[i]);
		if(i == 0){
			return;
		}else{
			reverse(array,i-1);
		}
		
	}
}


