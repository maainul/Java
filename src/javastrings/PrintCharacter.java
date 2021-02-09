package javastrings;

public class PrintCharacter {

	public static void main(String[] args) {
		for (int i = 0; i < 26; i++) {
			System.out.println(i + "-----" + ((char) (i + 'a')));
		}
	}

}

//package intervieQuestions.String._CC_24_PrintCommonCharactersOfTwoStringsinAlphabeticalOrder;

/******************************************************
 * Print common characters of two Strings in alphabetical order Given two
 * strings, print all the common characters in lexicographical order. If there
 * are no common letters, print -1. All letters are lower case. Examples:
 * 
 * Input : string1 : geeks string2 : forgeeks Output : eegks
 * 
 * Explanation: The letters that are common between the two strings are e(2
 * times), k(1 time) and s(1 time). Hence the lexicographical output is "eegks"
 * 
 * Input : string1 : hhhhhello string2 : gfghhmh Output : hhh
 ********************************************************/
/*
 * public class _24_PrintCommonCharactersOfTwoStringsinAlphabeticalOrder {
 * 
 * public static void main(String[] args) { printstring("hhhhello", "gfghhmh");
 * 
 * }
 * 
 * private static void printstring(String string1, String string2) {
 * 
 * int[] arr1 = new int[26]; int[] arr2 = new int[26]; for (int i = 0; i <
 * string1.length(); i++) {
 * 
 * arr1[string1.charAt(i) - 'a']++; System.out.println(arr1[string1.charAt(i) -
 * 'a'] + "--" + string1.charAt(i));
 * 
 * } System.out.println(); for (int i = 0; i < string2.length(); i++) {
 * 
 * arr2[string2.charAt(i) - 'a']++; System.out.println(arr2[string2.charAt(i) -
 * 'a'] + "--" + string2.charAt(i));
 * 
 * } System.out.println(); for(int i = 0; i< 26;i++) { System.out.println(i +
 * "----" + arr1[i] + "--" + ((char) (i + 'a'))); } System.out.println();
 * 
 * for (int i = 0; i < 26; i++) { if (arr1[i] != 0 && arr2[i] != 0) {
 * System.out.println(i + "----" + arr1[i] + "--" + ((char) (i + 'a')));
 * System.out.println(i + "----" + arr2[i] + "--" + ((char) (i + 'a'))); // Find
 * the minimum of the occurrence // of the character in both strings and print
 * // the letter that many number of times for (int j = 0; j < Math.min(arr1[i],
 * arr2[i]); j++) System.out.print(((char) (i + 'a'))); } }
 * 
 * }
 * 
 * }
 */