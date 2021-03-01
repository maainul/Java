package interviewQuestions.character_counting;

public class FactorialOfArray {

	public static void main(String[] args) {
		int[] array = { 0, 0, 2, 2, 2, 1, 1, 0, 0, 0, 0 };

		System.out.println(factorialcalcualtion(array));

	}

	private static int sumOfArray(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		System.out.println(sum);
		return sum;
	}

	private static int factorialcalcualtion(int[] array) {
		int fact = 1;

		for (int i = 0; i < array.length; i++) {
			fact = fact * factorial(array[i]);
		}

		return factorial(sumOfArray(array)) / fact;
	}

	private static int factorial(int n) {
		int fact = 1;
		for (int j = 2; j <= n; j++) {
			fact = fact * j;
		}
		return fact;
	}

}