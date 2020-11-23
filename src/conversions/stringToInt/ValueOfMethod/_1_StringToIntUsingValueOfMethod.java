package conversions.stringToInt.ValueOfMethod;

public class _1_StringToIntUsingValueOfMethod {

	public static void main(String[] args) {
		String string = "230";
		System.out.println("String :"+string);
		int i = 0;
		try {
			i = Integer.valueOf(string);
			System.out.println("Int value :"+i);
		} catch (NumberFormatException e) {
			System.out.println("Invalid Number.");
		}
		System.out.println("Concatenation of string :"+string+10); // not posssible,string
		System.out.println("Contatenation of int :"+i+10);

	}

}
