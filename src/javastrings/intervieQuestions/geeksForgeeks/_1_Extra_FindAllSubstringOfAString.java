package javastrings.intervieQuestions.geeksForgeeks;

public class _1_Extra_FindAllSubstringOfAString {

	public static void main(String[] args) {
		String s ="aabbcc";
		int count =0;
		// s.substring(beginIndex, endIndex)
		System.out.println("All substrings :");
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j <= s.length(); j++) {
				String substrings= s.substring(i, j);
				System.out.println(substrings);
				if(substrings.length() == 2) {
					
					count++;
				}
			}
		}
		System.out.println("Value of substring containing 2 string: "+count);

	}

}
