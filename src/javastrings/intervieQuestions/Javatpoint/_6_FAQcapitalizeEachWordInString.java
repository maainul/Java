package javastrings.intervieQuestions.Javatpoint;

class StringFormatter{
	public static String capitalizeWord(String str) {
		String wordString[] = str.split("\\s");
		String capilizeString = "";
		for (String w: wordString) {
			String firstString = w.substring(0,1);
			String afterString = w.substring(1);
			capilizeString +=firstString.toUpperCase()+afterString.toLowerCase()+" ";
		}
		return capilizeString.trim();	
	}
}

public class _6_FAQcapitalizeEachWordInString {
	public static void main(String args[]) {
		System.out.println(StringFormatter.capitalizeWord("I am Bangladeshi"));
	}
}
