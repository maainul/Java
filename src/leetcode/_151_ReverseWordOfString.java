/*
 * 151. Reverse Words in a String (Medium)


Given an input string, reverse the string word by word.

Example 1:

Input: "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: "  hello world!  "
Output: "world! hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 

Note:

A word is defined as a sequence of non-space characters.
Input string may contain leading or trailing spaces. 
However, your reversed string should not contain leading or trailing spaces.
You need to reduce multiple spaces between two words to a single space in the reversed string.
 */
package leetcode;

public class _151_ReverseWordOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "  hello you world!  ";
		//reverse(string);
		System.out.println(reverse(string));
		
		System.out.println(new String(" hello     there   ").trim().replaceAll("\\s{2,}", " "));
	}

	

	private static String reverse(String string) {
		String[] strs = string.split(" ");
		StringBuilder sBuilder = new StringBuilder();
		
		for (int i = strs.length-1; i>= 0; i--) {
			if(strs[i].length() == 0) continue;
			sBuilder.append(strs[i]);
			sBuilder.append(" ");
		}
		return sBuilder.toString().trim();
		
	}
	
	
	public String reverseWords(String s) {
        s = s.trim().replaceAll("\\s{2,}", " ");
        String[] str = s.split(" ");
        
        StringBuilder sb = new StringBuilder();
        for(int i = str.length -1 ; i >= 0 ; i--){
            sb.append(str[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
	
	
}
