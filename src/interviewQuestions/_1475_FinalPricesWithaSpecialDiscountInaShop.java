/**
 * @Author Md. Mainul Hasan
 * 
 * 3:02:42 AM
 * 
 * Sep 28, 2020
 *
 */
package interviewQuestions;

import java.util.Arrays;

public class _1475_FinalPricesWithaSpecialDiscountInaShop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] prices = { 8, 4, 6, 2, 3 };
		int[] ar = finalPrices(prices);
		System.out.println(Arrays.toString(ar));
	}

	public static int[] finalPrices(int[] prices) {
		for (int i = 0; i < prices.length - 1; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				if (prices[i] - prices[j] >= 0) {
					prices[i] = prices[i] - prices[j];
					break;
				}
			}

		}
		return prices;
	}

}
