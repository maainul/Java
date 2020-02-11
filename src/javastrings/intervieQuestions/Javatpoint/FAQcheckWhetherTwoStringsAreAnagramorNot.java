// Two strings are called anagrams if they contain same set of characters but in different order
package javastrings.intervieQuestions.Javatpoint;

import java.util.Arrays;

class AnagramStrin{
	static void isAnagram(String str1, String str2) {
		String s1 = str1.replaceAll("\\s", "");
		String s2 = str2.replaceAll("\\s", "");
		
		boolean status = true;
		
		if(s1.length() !=s2.length()) {
			status = false;
		}
		else {
			char[] Arrays1 = s1.toLowerCase().toCharArray(); // make array of strings
			char[] Arrays2 = s2.toLowerCase().toCharArray();
			Arrays.sort(Arrays1); //sort all array
			Arrays.sort(Arrays2);
			status = Arrays.equals(Arrays1,Arrays2);
		}
		
		if(status) {
			System.out.println(s1+" and "+s2+" are anagrams");
		}
		else {
			System.out.println(s1+" and "+s2+"are Not anagrams");
		}
		
	}
}

public class FAQcheckWhetherTwoStringsAreAnagramorNot {

	public static void main(String[] args) {
		AnagramStrin.isAnagram("Keep","Peek");
		AnagramStrin.isAnagram("Mother In Law", "Hitler Woman");  
		AnagramStrin.isAnagram("Bilai In Law","Hitler Women");

	}

}
