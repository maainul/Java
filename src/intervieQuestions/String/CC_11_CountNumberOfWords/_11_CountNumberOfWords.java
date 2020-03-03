package intervieQuestions.String.CC_11_CountNumberOfWords;
/* 
 
   Java program to count no of words
   Count words in a given string
   Given a string, count number of words in it. 
   The words are separated by following characters: 
   space (‘ ‘) or new line (‘\n’) or tab (‘\t’) 
   or a combination of these.
      
*/
public class _11_CountNumberOfWords {    
    // Driver program to test above functions 
    public static void main(String args[]) {
    	String str = "One two       three\n four\tfive  "; 
    	System.out.println(countWordmethod(str));
        
    }

	private static int countWordmethod(String str) {
		boolean flag = true;
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
		// If next character is a separator, set the  
        // flag true 
		 if(str.charAt(i) == ' ' || str.charAt(i)=='\n' || str.charAt(i)=='\t'){
				flag = true;
			}
		 
		 // If next character is not a word separator 
         // and state is OUT, then set the state as IN 
         // and increment word count 
		 else if (flag == true) {
				flag = false;
				count++;
			}
		}
		return count;
		
	} 
} 
