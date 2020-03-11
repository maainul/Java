package OCA;

public class ArrayDecleration {

	public static void main(String[] args) {
		int[] numbers1 = new int[3]; 

		int[] numbers2 = new int[] { 23, 45, 10 };

		int[] numbers3 = { 42, 45, 12 };

		for (int i = 0; i < numbers1.length; i++) {
			System.out.println(numbers1[i]);
		}

		System.out.println();
		for (int i = 0; i < numbers2.length; i++) {
			System.out.println(numbers2[i]);
		} 

		System.out.println();
		for (int i = 0; i < numbers3.length; i++) {
			System.out.println(numbers3[i]);
		}

		int[] numbers = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 5;
			System.out.println(i + "---" + numbers[i] + "----" + (i +2));
		}

	}

}
