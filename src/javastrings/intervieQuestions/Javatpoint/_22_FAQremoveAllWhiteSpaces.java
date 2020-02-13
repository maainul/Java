package javastrings.intervieQuestions.Javatpoint;

public class _22_FAQremoveAllWhiteSpaces {

	public static void main(String[] args) {
		// By replaceall method
		String string = " I am Bangladeshi";
		System.out.println(string.replaceAll("\\s", ""));
		
		// By stringbuffer
		char[] strArray  = string.toCharArray();
		StringBuffer stringBuffer = new StringBuffer();
		
		for (int i = 0; i < strArray.length; i++) {
			  if ((strArray[i] != ' ') && (strArray[i] != '\t')){
				stringBuffer.append(strArray[i]);
			}
		}
		System.out.println(stringBuffer.toString());
	}

}
