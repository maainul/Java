/*
 * Java Program to replace lower-case characters with upper-case and vice-versa
Here, our task is to replace all the lower-case characters in the string to upper-case and upper-case characters to lower-case.

For this purpose, we need to traverse the string and check for each character. If the character is a lower-case character, make it upper-case by using the language-specific built-in method or add 32 to the lower-case character in C to change the ASCII value of the character.

For programming, follow the algorithm given below:

Algorithm
	STEP 1: START
	STEP 2: DEFINE string str = "Great Power".
	STEP 3: DEFINE newstr as StringBuffer object .
	STEP 4: SET i=0. REPEAT STEP 5 to STEP 6 UNTIL i<str.length().
	STEP 5: IF lower-case character encountered then CONVERT them in upper-case using built-in function
	else
	IF upper-case character encountered then CONVERT them in lower-case characters using built-in function.
	STEP 6: i=i+1
	STEP 7: PRINT newstr.
	STEP 8: END
 */
package intervieQuestions.String;

public class _11_AllLowerCaseToUpperANdUpperCaseToLower {    
    public static void main(String[] args) {    
            
        String str1="Great Power";    
        StringBuffer newStr=new StringBuffer(str1);    
            
        for(int i = 0; i < str1.length(); i++) {    
                
            //Checks for lower case character    
            if(Character.isLowerCase(str1.charAt(i))) {    
                //Convert it into upper case using toUpperCase() function    
                newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));    
            }    
            //Checks for upper case character    
            else if(Character.isUpperCase(str1.charAt(i))) {    
                //Convert it into upper case using toLowerCase() function    
                newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));    
            }    
        }    
        System.out.println("String after case conversion : " + newStr);    
    }   
}

