package javastrings.intervieQuestions.Javatpoint;

class Stringtogglerr{
	public static String reversetoggelerMethod(String str) {
		String wordString[] = str.split("\\s");
		String reveseStringToggler = "";
		for(String w:wordString) {
			StringBuilder stringBuilder = new StringBuilder(w);
			stringBuilder.reverse();
			//System.out.println(stringBuilder.reverse());
			String firstString=stringBuilder.substring(0,1);  
	        	String afterString=stringBuilder.substring(1);  
			reveseStringToggler +=firstString.toLowerCase()+afterString.toUpperCase()+" ";
		}
		return reveseStringToggler;
		
	}
}
public class _9_FAQReversetOGGLEeachWordInString {

	public static void main(String[] args) {
		System.out.println("this is Bangladesh");
		System.out.println(Stringtogglerr.reversetoggelerMethod("this is Bangladesh"));

	}

}
