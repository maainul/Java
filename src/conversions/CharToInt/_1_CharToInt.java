package conversions.CharToInt;

public class _1_CharToInt {

	public static void main(String[] args) {
		
		// Method No 1.
		char c ='a';
		char c2 = '1';
		int a = c;
		int b = c2;
		
		System.out.println(a);
		System.out.println(b);
		
		int aa = Character.getNumericValue(c2);
		System.out.println(aa);
		
		System.out.println(Character.getNumericValue(c));
		System.out.println(Character.getNumericValue(b));
	}

}
