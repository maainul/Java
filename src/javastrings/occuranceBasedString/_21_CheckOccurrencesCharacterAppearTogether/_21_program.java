/**
 * @Author Md. Mainul Hasan
 * 
 * 1:37:15 PM
 * 
 * Nov 19, 2020
 *
 */
package javastrings.occuranceBasedString._21_CheckOccurrencesCharacterAppearTogether;

public class _21_program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "111000110323";
		char c = '1';
		
		System.out.println(occuranceTogether(s,c));
	}

	private static boolean occuranceTogether(String s, char c) {
		 // To indicate if one or more  
        // occurrences of 'c' are seen 
        // or not. 
        boolean oneSeen = false; 
      
        // Traverse given string 
        int i = 0, n = s.length(); 
        while (i < n)  
        { 
      
            // If current character is 
            // same as c, we first check 
            // if c is already seen.          
            if (s.charAt(i) == c)  
            { 
                if (oneSeen == true) 
                    return false; 
      
                // If this is very first 
                // appearance of c, we  
                // traverse all consecutive 
                // occurrences. 
                while (i < n && s.charAt(i) == c) 
                    i++; 
      
                // To indicate that character 
                // is seen once. 
                oneSeen = true; 
            } 
      
            else
                i++; 
        } 
          
        return true; 
	}

}
