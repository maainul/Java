package leetcode;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strs = {"flower","flow","flight","flew","fletch"};
		longestCommonPrefix(strs);	
	}
	
	public static String longestCommonPrefix(String[] strs) {
		
		String longestCommonPrefixString = "";
		
		if(strs == null || strs.length == 0) {
			return longestCommonPrefixString;
		}
		
		int index = 0;
		for (char c : strs[0].toCharArray()) {
			for (int i = 1; i < strs.length; i++) {
				if(index >= strs[i].length() || c != strs[i].charAt(index)) {
					return longestCommonPrefixString;
				}
			} // for loop
			longestCommonPrefixString+=c;
			index++;
		} // for each loop 
		return longestCommonPrefixString;	
	}
}
