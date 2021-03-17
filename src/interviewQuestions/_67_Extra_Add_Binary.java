package interviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class _67_Extra_Add_Binary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Number 1:");
		int num1 = sc.nextInt();

		System.out.println("Number 2:");
		int num2 = sc.nextInt();

		IntToBinary(num1, num2);
		sc.close();
		System.out.println("\nString to binary ");
		StringToBinaryAddition();

	}

	private static void StringToBinaryAddition() {
		String snum1 = "1010";
		String snum2 = "1010";
		// convert string to int by using parse string
		int num1 = Integer.parseInt(snum1);
		int num2 = Integer.parseInt(snum2);
		int[] arr = new int[8];
		int carry = 0, sum = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			int digit1 = num1 % 10;
			int digit2 = num2 % 10;

			num1 = num1 / 10;
			num2 = num2 / 10;
			sum = digit1 + digit2 + carry;
			if (sum == 0) {
				arr[i] = 0;
				carry = 0;
			} else if (sum == 1) {
				arr[i] = 1;
				carry = 0;
			} else if (sum == 2) {
				arr[i] = 0;
				carry = 1;
			} else if (sum == 3) {
				arr[i] = 1;
				carry = 1;
			}
		}

		for (int j : arr) {
			System.out.print(j);
		}

	}

	public static void IntToBinary(int num1, int num2) {
		int digit1, digit2, carry = 0, sum = 0;
		int[] arr = new int[8];
//---------------------------------------------------------	
		for (int i = arr.length - 1; i >= 0; i--) {

			digit1 = num1 % 10;
			digit2 = num2 % 10;
			num1 = num1 / 10;
			num2 = num2 / 10;

			sum = digit1 + digit2 + carry;

			if (sum == 0) {
				arr[i] = 0;
				carry = 0;
			} else if (sum == 1) {
				arr[i] = 1;
				carry = 0;
			} else if (sum == 2) {
				arr[i] = 0;
				carry = 1;
			} else if (sum == 3) {
				arr[i] = 1;
				carry = 1;
			}
		}

		String str = Arrays.toString(arr);
		System.out.println("int array as String in Java : " + str);

		// print result
		for (int j : arr) {
			System.out.print(j);
		}
	}

}
