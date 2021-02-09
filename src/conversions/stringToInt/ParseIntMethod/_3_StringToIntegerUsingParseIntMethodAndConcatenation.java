package conversions.stringToInt.ParseIntMethod;

public class _3_StringToIntegerUsingParseIntMethodAndConcatenation {
	public static void main(String agr[]) {
		String string = "200";

		int i = Integer.parseInt(string);

		System.out.println(string + 200);// 200100, because "200"+100, here + is a string concatenation operator
		System.out.println(i + 100);// 300, because 200+100, here + is a
	}
}
