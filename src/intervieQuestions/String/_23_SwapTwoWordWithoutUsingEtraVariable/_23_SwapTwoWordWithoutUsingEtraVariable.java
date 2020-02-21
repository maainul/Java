/*
Java Program to swap two string variables without using third or temp variable.
In this program, we need to swap two strings without using a third variable.

Str1: Good Str2: morning

Swapping two strings usually take a temporary third variable. One of the approach to accomplish this is to concatenate given two strings into first string.

Str1Str1 = Str1 + Str2= Goodmorning

Extract string 2 using substring (0, length(string1) - (string2)) i.e. in our case it will be substring(0, (11-4)). It will assign string Good to string 2 which is highlighted by green.

Str2 = Goodmorning

Extract string 1 using substring (length(string2)) i.e. we need to extract string from in length(string2) till end of the string. In our case it will be substring(4). It will assign string morning to string 1 which is highlighted by green.

Str1 = Goodmorning

Algorithm
	STEP 1: START
	STEP 2: DEFINE Strings str1 = "Good ", str2 = "morning " to swap
	STEP 3: PRINT "Strings before swapping " str1, str2
	STEP 4: str1 =str1 + str2
	STEP 5: EXTRACT str1 from indexes 0 to length (str1) - (str2) using substring function and store it in str2.
	STEP 6: EXTRACT str1 from index length(str2) till end using substring function and store it in str1.
	STEP 7: PRINT "Strings after swapping " str1, str2.
	STEP 8: END

 */

package intervieQuestions.String._23_SwapTwoWordWithoutUsingEtraVariable;

public class _23_SwapTwoWordWithoutUsingEtraVariable {

	public static void main(String[] args) {
		
		String str1 = "Good ", str2 = "morning ";    
		
		System.out.println("Strings before swapping: " + str1 + " " + str2);    
		 
		str1 = str1 + str2;
		System.out.println(str1.length());
		str2 = str1.substring(0,(str1.length()-str2.length()));
		 
		str1 = str1.substring(str2.length());
		 
		System.out.println("Strings after swapping: " + str1 + " " + str2);    

	}

}
