package oca;

public class WraperClass {

	public static void main(String[] args) {
		int primitive = Integer.parseInt("123");
		System.out.println(primitive);
		int wrapper = Integer.valueOf("123");
		System.out.println(wrapper);

		// int bad1 = Integer.parseInt("a");
		// System.out.println(bad1); // through NumberFormateException

		// int bad2 = Integer.valueOf("123.45");
		// System.out.println(bad2); // Through NumberFormateException

		int i = 5;

		// use primitive variable as a Object reference variable is called
		// Boxing/Wrapping.
		// putting the primitive value in the CLass is called wrapping
		// Integer ii = new Integer(i); // Wrapping// Boxing// AutoBoxing
		Integer ii = i; // AutoWrapping//// AutoBoxing
		System.out.println(ii);

		// fetching the value from the integer class is called AutoBoxing
		int j = ii.intValue();
		System.out.println(j);

	}

}
