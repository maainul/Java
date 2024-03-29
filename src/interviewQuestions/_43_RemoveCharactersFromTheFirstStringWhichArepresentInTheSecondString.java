package interviewQuestions;

public class _43_RemoveCharactersFromTheFirstStringWhichArepresentInTheSecondString {
	// Java program to remove duplicates, the order of characters is not maintained
	// in this program

	static final int NO_OF_CHARS = 256;

	/*
	 * Returns an array of size 256 contain count of characters in the passed char
	 * array
	 */
	static int[] getCharCountArray(String str) {
		int[] count = new int[NO_OF_CHARS];
		for (int i = 0; i < str.length(); i++)
			count[str.charAt(i)]++;

		return count;
	}

	/*
	 * removeDirtyChars takes two string as arguments: First string (str) is the one
	 * from where function removes dirty characters. Second string is the string
	 * which contain all dirty characters which need to be removed from first string
	 */
	static String removeDirtyChars(String str, String mask_str) {
		int[] count = getCharCountArray(mask_str); // 0,0,0,......,1,0,0,0,0,1,1,1......
		int ip_ind = 0, res_ind = 0;

		char[] arr = str.toCharArray(); // g,e,e,k,s,f,o,r,g,e,e,k,s

		while (ip_ind != arr.length) {
			char temp = arr[ip_ind]; // temp = g,e,e,k,s,f,o,r,g,e,e,k,x
			if (count[temp] == 0) {
				arr[res_ind] = arr[ip_ind];
				res_ind++;
			}
			ip_ind++;

		}

		str = new String(arr);

		/*
		 * After above step string is ngring. Removing extra "iittg" after string
		 */

		return str.substring(0, res_ind);

	}

	// Driver Method
	public static void main(String[] args) {
		String str = "geeksforgeeks";
		String mask_str = "mask";
		System.out.println(removeDirtyChars(str, mask_str));
	}
}
