package oca;

public class _4_1_PassingDataAmongMethods {
	public static void main(String[] args) {
		int num = 4;
		newNumber(5);
		System.out.println(num);
	}

	private static void newNumber(int num) {
		num = 8;
		System.out.println(num);
	}

}
