package oca;

public class _4_2_PassByValuePassByReference {

	public static void main(String[] args) {
		int original1 = 1;
		int original2 = 2;
		
		swap(original1,original2);
		System.out.println(original1); // 1
		System.out.println(original2); // 2

	}

	private static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
}
