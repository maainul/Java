public class PrintArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,9,21,31,80};
		printa(arr,0,arr.length-1,0);
		System.out.println(sumOfN(0,0,5));

	}

	private static boolean sumOfN(int i, int sum, int n ) {
		sum = sum + i;
		if ( i  == n ) {
			System.out.println(sum);
			return false;
		}
		sumOfN(i+1, sum, n);
		return false;
	}

	private static void printa(int[] arr,int i, int length, int sum) {
		if (i > length) {
			System.out.println("total is = "+sum);
			return ;
		}
		
		System.out.println(arr[i]);
		printa(arr, i+1,length, sum + arr[i]);
	}


	
	
	
}
