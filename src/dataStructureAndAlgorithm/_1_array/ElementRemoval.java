package dataStructureAndAlgorithm._1_array;

public class ElementRemoval {

	public static void main(String[] args) {

		int input[] = { 3, 7, 7, 1, 1, 9, 9, 10, 9 };
		System.out.println("Value Before sorting sorted : ");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}

		for (int i = 0; i < input.length; i++) {
			for (int j = i; j < input.length; j++) {
				if (input[i] > input[j]) {
					int temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}
		System.out.println("\n\nAfter sorting : ");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}

		int current = input[0];

		System.out.println("\n\nAfter removing");
		for (int i = 1; i < input.length; i++) {

			if (current != input[i]) {
				System.out.print(current + " ");
				current = input[i];
			}

		}
		System.out.print(current + " ");

	}
}