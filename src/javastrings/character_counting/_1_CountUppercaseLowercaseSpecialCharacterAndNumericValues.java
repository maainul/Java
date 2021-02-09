package javastrings.character_counting;

/*
 *  1. uppercase
 *  2. Lowercase
 *  3. Special Character
 *  4. Numerical value
 *  
 *  Java For Dummies Quick Reference Java has two operators 
 *  for performing logical And operations: 
 *  	& and &&. 
 *  Both combine two Boolean expressions and return true 
 *  only if both expressions are true. ... 
 *  If they're both true, the & operator returns true. 
 *  If one is false or both are false, 
 *  the & operator returns false.
 *  
 *  
 *  Upper Case Character :5
	Lower Case Character:32
	Numerical Value:5
	Special Character :11

 *  
 */
public class _1_CountUppercaseLowercaseSpecialCharacterAndNumericValues {

	public static void main(String[] args) {// TODO Auto-generated method stub
		int upperCase = 0, lowerCase = 0, specialCharacter = 0, numericalValue = 0;

		// String s1 = "La Ilaha Illalahu Mohammadur Rasulullah!@11278(%sm%).";
		String s1 = "Mainul Hasan An!i<";
		for (int i = 0; i < s1.length(); i++) {

			char ch = s1.charAt(i);

			if (ch >= 'A' && ch <= 'Z') {
				upperCase++;
			} else if (ch >= 'a' && ch <= 'z') {
				lowerCase++;
			} else if (ch >= '0' && ch <= '9') {
				numericalValue++;
			} else {
				specialCharacter++;
			}
		}

		System.out.println("Upper Case Character :" + upperCase);
		System.out.println("Lower Case Character:" + lowerCase);
		System.out.println("Numerical Value:" + numericalValue);
		System.out.println("Special Character :" + specialCharacter);

	}

}
