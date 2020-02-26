package intervieQuestions.String;

class Stringtoggler{
	public static String toggelerMethod(String str) {
		String wordString[] = str.split("\\s");
		String SumofString = "";
		for (String w: wordString) {
			String firstString = w.substring(0,1);
			String afterString = w.substring(1);
			SumofString +=firstString.toLowerCase()+afterString.toUpperCase()+" ";
		}
		return SumofString.trim();	
	}
}
public class _8_FAQtOGGLEeachWordInString {

	public static void main(String[] args) {
		System.out.println(Stringtoggler.toggelerMethod("this is Bangladesh"));

	}

}
