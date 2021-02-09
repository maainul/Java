package dataStructureAndAlgorithm._1_array;

/***************************************
 * The Java.lang.math.max() function is an inbuilt function in Java which
 * returns maximum of two numbers.
 * 
 * The arguments are taken in int, double, float and long.
 * 
 * If a negative and a positive number is passed as argument then the positive
 * result is generated.
 * 
 * And if both parameters passed are negative then the number with the lower
 * magnitude is generated as result.
 * 
 *****************************************/

public class MaxMethod {

	public static void main(String[] args) {
		double a = 12.123;
		double b = 12.456;
		double x = 23;
		double y = -23;
		double m = -25;
		double n = -23;

		System.out.println(Math.max(a, b));
		System.out.println(Math.max(x, y));
		System.out.println(Math.max(m, n));

	}

}
/*
 * 12.456 23.0 -23.0
 */