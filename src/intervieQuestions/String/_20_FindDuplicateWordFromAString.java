/*
Java program to find the duplicate words in a string
In this program, we need to find out the duplicate words present in the string and display those words.

Example: big black bug bit a big black dog on his big black nose

To find the duplicate words from the string, we first split the string into words. We count the occurrence of each word in the string. If count is greater than 1, it implies that a word is duplicate in the string.

ALGORITHM
	STEP 1: START
	STEP 2: DEFINE String string = "Big black bug bit a big black dog on his big black nose"
	STEP 3: DEFINE count
	STEP 4: CONVERT string into lower-case.
	STEP 5: INITIALIZE words[] to SPLIT the string.
	STEP 6: PRINT "Duplicate words in a given string:"
	STEP 7: SET i=0. REPEAT STEP 8 to 12 STEP UNTIL i
	STEP 8: SET count =1.
	STEP 9: SET j = i+1. REPEAT STEP 10 to STEP 11 UNTIL j
	STEP 10: IF (words[i].equals(words[j])
	              then
	              count = count + 1
	              words[j]= 0
	STEP 11: j = j + 1
	STEP 12: i = i + 1
	STEP 13: IF(count>1 && words[i] != 0) then PRINT words[i]
	STEP 13: END

 */
package intervieQuestions.String;

public class _20_FindDuplicateWordFromAString {

	public static void main(String[] args) {
		String string = "Big black bug bit a big black dog on his big black nose";    
		int count;
		
		// convert to lowecase
		string = string.toLowerCase();
		
		//split
		String words[] = string.split(" ");

		for (int i = 0; i < words.length; i++) {
			count = 1;
			for (int j = i+1; j < words.length; j++) {
				if(words[i].equals(words[j])) {
					count++;
					
					words[j] = "0";
				}
			}
		
		
		if(count >1 && words[i] !="0") {
			System.out.println(words[i]);
		}
		}
	}

}
