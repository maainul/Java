package javastrings.intervieQuestions.Javatpoint;
 
class StringProcess{
	static void getstring(String str) {
		int totalchar = str.length();
		System.out.println(totalchar);
		int uppercase = 0;
		int lowercase = 0;
		int digits = 0;
		int special = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)) {
				uppercase++;
			}
			else if (Character.isLowerCase(ch)){
				lowercase++;
			}
			else if (Character.isDigit(ch)) {
				digits++;
			}
			else {
				special++;
			}
		}
		
		double upperPercentage = (uppercase*100)/totalchar;
		double lowerPercentage = (lowercase*100)/totalchar;
		double digitPercentage = (digits*100)/totalchar;
		double specialPercentage = (special*100)/totalchar;
		 
		System.out.println(upperPercentage+"%");
		System.out.println(lowerPercentage+"%");
		System.out.println(digitPercentage+"%");
		System.out.println(specialPercentage+"%");
	}
}

public class FAQfindThePercentageOfUppercaseLowercaseDigitsAndSpecialCharactersInaString {

	public static void main(String[] args) {
		StringProcess.getstring("He said,''Bangladesh is my country''.");
		
	}

}
