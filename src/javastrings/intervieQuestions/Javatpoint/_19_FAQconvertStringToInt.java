package javastrings.intervieQuestions.Javatpoint;

public class _19_FAQconvertStringToInt {

	public static void main(String[] args) {
		String string = "200";
		
		// Integer.parseInt()
		int i = Integer.parseInt(string);
		System.out.println(i);
		
		//Understanding String Concatenation Operator
		System.out.println(string+100);//200100, because "200"+100, here + is a string concatenation
		System.out.println(i+100);//300, because 200+100, here + is a binary plus operator  
		
		// Integer.valueOf()
		
		//converting String into Integer using Integer.valueOf() method  
		Integer integer = Integer.valueOf(string);
		System.out.println(integer);

	}

}
