package leetcode;
/*
830. Positions of Large Groups
Easy

328

85

Add to List

Share
In a string S of lowercase letters, these letters form consecutive groups of the same character.

For example, a string like S = "abbxxxxzyy" has the groups "a", "bb", "xxxx", "z" and "yy".


Call a group large if it has 3 or more characters.  
We would like the starting and ending positions of every large group.

The final answer should be in lexicographic order.

 

Example 1:

Input: "abbxxxxzzy"
Output: [[3,6]]
Explanation: "xxxx" is the single large group with starting  3 and ending positions 6.
Example 2:

Input: "abc"
Output: []
Explanation: We have "a","b" and "c" but no large group.
Example 3:

Input: "abcdddeeeeaabbbcd"
Output: [[3,5],[6,9],[12,14]]

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _830_PositionsofLargeGroups {

	public static void main(String[] args) {
		String string = "abbxxxxzzy";
		System.out.println(largeGroupPositions(string));

	}

	public static List<List<Integer>> largeGroupPositions(String S) {
		List<List<Integer>> answer = new ArrayList<>();
		int length = 1;

		for (int i = 1; i <= S.length(); i++) {
			if (i < S.length() && S.charAt(i) == S.charAt(i - 1)) {
				length++;
			} else {
				if (length > 2) {
					answer.add(Arrays.asList(i - length, i - 1));
				}

				length = 1;
			}
		}

		return answer;
	}

}
