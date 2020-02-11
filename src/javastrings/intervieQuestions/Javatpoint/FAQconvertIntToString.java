package javastrings.intervieQuestions.Javatpoint;

public class FAQconvertIntToString {

	public static void main(String[] args) {
		int i = 200;
		
		// valueOf() method
		String string = String.valueOf(i);
		System.out.println(string);
		System.out.println(string+100);
		System.out.println(i+100);
		
		// integer.toString();
		String string2 = Integer.toString(i);
		System.out.println(string2);
		System.out.println(string2+200);
		
		// format
		String string3 = String.format("%d",i);
		System.out.println(string3);
		System.out.println(string3+100);
		
	}

}
