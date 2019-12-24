package javastrings;

class StringChecker{
	public static String reverseStringmethod(String str) {
		String wordString[] = str.split("\\s");
		String SumofString="";
		
		for (String w: wordString) {
			StringBuilder stringBuilder= new StringBuilder(w);
			stringBuilder.reverse();
			SumofString+=stringBuilder+" ";
		
		}
		
		return SumofString;
	}
}

public class FAQReverseEachWordInString {
	public static void main(String args[]) {
		System.out.println(StringChecker.reverseStringmethod("this is javatpoint"));
	}
}
