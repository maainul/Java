package recursion.Problem5;

public class SumOfNInterger {
	public static void main(String[] args) {
		int array[] = {23,11,44,16};
		int sum= 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum+array[i];
		}
		System.out.println("Sum of Interger: "+sum);
	}
}
