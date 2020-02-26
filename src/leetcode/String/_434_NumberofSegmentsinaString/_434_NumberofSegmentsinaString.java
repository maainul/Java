/*****************************************************************
434. Number of Segments in a String Easy

Count the number of segments in a string, where a segment 
is defined to be a contiguous sequence of non-space characters.

Please note that the string does not contain any non-printable characters.

Example:

Input: "Hello, my name is John"
Output: 5
*************************************************************************/

package leetcode.String._434_NumberofSegmentsinaString;

public class _434_NumberofSegmentsinaString {

	public static void main(String[] args) {
		String s = "Hello, this is leetcode problem";
		System.out.println(countSegments(s));
	}
	
	public static int countSegments(String s) {
		int n = s.length();
		int segments = 0;
		for(int i = 0; i<n; i++) {
			// Rule 1--- Jodi prothom i == 0 ebong porer element ta jodi faka na thake tahole segment
			// Rule 2--- Jodi bortoman char != 0 hoi ebong purber char faka hoi tahole segment
			if((i== 0 || s.charAt(i-1) == ' ')&& s.charAt(i) !=' ') {
				segments++;
			}
		}
		return segments;

	}

}
