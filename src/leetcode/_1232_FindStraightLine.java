package leetcode;

/*
1232. Check If It Is a Straight Line

Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
Output: true
 */
public class _1232_FindStraightLine {

	public static void main(String[] args) {

	}

	/*
	 * 
	 * So basically at any point of time,
	 * 
	 * any three coordinate should satisfy following condition to be colinear.
	 * 
	 * (y2 - y1)(x3 - x1) == (x2 - x1)(y3 - y1)
	 * 
	 * since there will be atleast two coordinates given,
	 * 
	 * we can take first two coordinate and take ith coordinate to compute the
	 * formula.
	 * 
	 */

	class Solution {
		public boolean checkStraightLine(int[][] coordinates) {
			int x1 = coordinates[0][0];
			int y1 = coordinates[0][1];
			int x2 = coordinates[1][0];
			int y2 = coordinates[1][1];

			for (int i = 2; i < coordinates.length; i++) {
				int x3 = coordinates[i][0];
				int y3 = coordinates[i][1];

				if ((y2 - y1) * (x3 - x1) != (x2 - x1) * (y3 - y1)) {
					return false;
				}
			}
			return true;
		}
	}

}
