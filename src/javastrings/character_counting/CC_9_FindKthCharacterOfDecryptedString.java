package javastrings.character_counting;

public class CC_9_FindKthCharacterOfDecryptedString {

	public static void main(String[] args) {
		String str = "a2b2c3";
		int k = 4;
		System.out.println(findChar(str,k));

	}

	private static char findChar(String str, int k) {
		String temp ="";
		String expand = "";
		int freq = 0;
		
		for (int i = 0; i < str.length(); i++) {
			while(i<str.length() && str.charAt(i) >='a' && str.charAt(i)<='z') {
				temp = temp+str.charAt(i);
				i++;
			}
			while(i<str.length() && str.charAt(i)>='1' && str.charAt(i)>='9') {
				freq = freq * 10 + str.charAt(i)-'0';
				i++;
			}
			
			for (int j = 0; j < freq; j++) {
				expand = expand + temp;
			}
			
			if(freq == 0) {
				expand = expand + temp;
			}
		}
		return expand.charAt(k-1);
	}

}
