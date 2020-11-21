/**
 * @Author Md. Mainul Hasan
 * 
 * 3:32:36 AM
 * 
 * Nov 21, 2020
 *
 */
package javastrings.occuranceBasedString._28_RemoveRecurringDigitsInAGivenNumber;

public class _1_Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String num = "1299888833";
		char[] ch = num.toCharArray();

		System.out.println(removeRec(ch));
		

	}

	private static String removeRec(char[] ch) {
		
		// 1 22 333 4 5 6
		String s = "";
		for (int i = 0; i < ch.length-1; i++) {
			 /* Copy the first occurrence of new digit */
            s += String.valueOf(ch[i]); 

			while (i+1 < ch.length && ch[i] == ch[i+1]) {
				i++;
			}
			
		}
	return s;	
	}

}
