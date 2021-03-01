package interviewQuestions.leetcode;

/*
605. Can Place Flowers

Suppose you have a long flowerbed in which some of the plots are planted and some are not. However,
flowers cannot be planted in adjacent plots - they would compete for water and both would die.

Given a flowerbed (represented as an array containing 0 and 1, where 0 means empty and 1 means not empty),
and a number n, return if n new flowers can be planted in it without violating the no-adjacent-flowers rule.

Example 1:
Input: flowerbed = [1,0,0,0,1], n = 1
Output: True

Example 2:
Input: flowerbed = [1,0,0,0,1], n = 2
Output: False

 */

public class _605_CanPlaceFlower {
	public static void main(String args[]) {
		int flowerbed[] = { 1, 0, 0, 0, 1 };
		int n = 1;
		System.out.println(canPlaceFlowers(flowerbed, n));
		System.out.println(canPlaceFlowers2(flowerbed, n));
	}

	/*
	 * Approach in one pass-through of the array:
	 * 
	 * Count the total number of possible plants in the flowerbed. Spaces where
	 * plants are allowed are 3 zero's in a row, or 2 zero's in a row at either ends
	 * of the flowerbed. Check n compared to that number of possible plants.
	 */
	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		int count = 0;
		int len = flowerbed.length;

		int i = 0;
		while (i < len) {
			if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) // First element or the element before is also 0
					&& (i == len - 1 || flowerbed[i + 1] == 0)) { // Last element or the element after is also 0
				count++;
				flowerbed[i] = 1;
			}
			i++;
		}

		return n <= count;
	}

	public static boolean canPlaceFlowers2(int[] flowerbed, int n) {
		int len = flowerbed.length;
		for (int i = 0; i < flowerbed.length; i++) {
			if ((i == 0 || flowerbed[i - 1] == 0) && (flowerbed[i] == 0) && (flowerbed[i + 1] == 0 || i == len - 1)) {
				flowerbed[i] = 1;
				n--;
			}

		}
		return n <= 0;
	}
}
