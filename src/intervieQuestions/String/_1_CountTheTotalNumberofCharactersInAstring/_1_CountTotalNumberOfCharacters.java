/*
Java Program to count the total number of characters in a string

In this program, we need to count the number of characters present in the string:

 "The best of both worlds"

To count the number of characters present in the string, we will iterate through the string and count the characters. In above example, total numbers of characters present in the string are 19.


For programming, follow the algorithm given below:

Algorithm
	STEP 1: START
	STEP 2: DEFINE String string = "The best of both worlds".
	STEP 3: SET count =0.
	STEP 4: SET i=0. REPEAT STEP 5 to STEP 6 UNTIL i<string.length
	STEP 5: IF (string.charAt(i)!= ' ') then count =count +1.
	STEP 6: i=i+1
	STEP 7: PRINT count.
	STEP 8: END
 */
package intervieQuestions.String._1_CountTheTotalNumberofCharactersInAstring;

public class _1_CountTotalNumberOfCharacters {

	public static void main(String[] args) {
		int count = 0;
		String string = "The best of both worlds";
		for (int i = 0; i < string.length(); i++) {
			if(string.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println("Number of words :"+count);

	}

}
