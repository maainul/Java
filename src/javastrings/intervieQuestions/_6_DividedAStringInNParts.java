/*
 Java Program to divide a string in 'N' equal parts.

Here, our task is to divide the string S into n equal parts. We will print an error message if the string cannot be divisible into n equal parts otherwise all the parts need to be printed as the output of the program.

To check whether the string can be divided into N equal parts, we need to divide the length of the string by n and assign the result to variable chars.

If the char comes out to be a floating point value, we can't divide the string otherwise run for loop to traverse the string and divide the string at every chars interval.

The algorithm of the program is given below.

Algorithm
	STEP 1: START
	STEP 2: DEFINE str = "aaaabbbbcccc"
	STEP 3: DEFINE len
	STEP 4: SET n =3
	STEP 5: SET temp = 0.
	STEP 6: chars = len/n
	STEP 7: DEFINE String[] equalstr.
	STEP 8: IF (len%n!=0)
	then PRINT ("String can't be divided into equal parts")
	else go to STEP 9
	STEP 9: SET i =0.
	STEP 10: REPEAT STEP 11 to STEP 14 UNTIL i<len
	STEP 11: DEFINE substring part.
	STEP 12: equalstr [temp] = part
	STEP 13: temp = temp + 1
	STEP 14: i = i + chars
	STEP 15: PRINT n
	STEP 16: SET i=0. REPEAT STEP 17 to STEP 18 UNTIL i<equalstr.length
	STEP 17: PRINT equalstr[i]
	STEP 18: i = i + 1
	STEP 19: END
  
 */

package javastrings.intervieQuestions;

public class _6_DividedAStringInNParts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
