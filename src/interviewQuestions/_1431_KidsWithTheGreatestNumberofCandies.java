package interviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class _1431_KidsWithTheGreatestNumberofCandies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int candies[] = { 2, 3, 5, 1, 3 };
		int extraCandies = 3;
		List<Boolean> list = kidsWithCandies(candies, extraCandies);
		System.out.println(list);

	}

	private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

		int max = -1;
		for (int i = 0; i < candies.length; i++) {
			max = Math.max(max, candies[i]);
		}

		List<Boolean> al = new ArrayList<Boolean>();
		for (int i = 0; i < candies.length; i++) {
			if (candies[i] + extraCandies >= max) {
				al.add(true);
			} else {

				al.add(true);
			}
		}
		return al;
	}

}
