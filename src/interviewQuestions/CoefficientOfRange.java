package interviewQuestions;

public class CoefficientOfRange {
	public static void main(String[] args) {
		int[] arr = { 2, 23, 4, 3, 10, 9, 75, 456, 32, 2 };
		float result = coefficentOfRange(arr);
		System.out.println(result);
	}

	private static float  coefficentOfRange(int[] arr) {
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i  : arr) {
			if (i > max) {
				max = i;
			}
			if (i < min) {
				min = i;
			}
		}
		System.out.println(max);
		System.out.println(min);
		return ((max + min) / (max-min));
		
	}

}
