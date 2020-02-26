/* 
 Input : str = “abc”
Output : 6
Proper substrings are “a”, “b”, “c”, “ab”, “bc”, “abc”

Input : str = “abcd”
Output : 10
Proper substrings are “a”, “b”, “c”, “d”, “ab”, “bc”, “cd”, “abc”, “bcd” and “abcd”
*/


package intervieQuestions.String.CC_2_NumberOfSubstringsOfaString;

public class _2_NumberOfSubstringsOfaString {
	
	public static void main(String[] args) {
		String string = "aabccc";
		int k = 2;
		stringCount(string,k);
		
	}

private static void stringCount(String string,int k) {
	int count = 0;
	
	for (int i = 0; i < string.length(); i++) {
		for (int j = i+1; j <= string.length(); j++) {
			String subStrings = string.substring(i,j);
			System.out.println(subStrings);
			if(subStrings.length() ==k) {
				count++;
			}
		}
	}
	System.out.println("Value of substrings :"+count);

	}
}