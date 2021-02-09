package dataStructureAndAlgorithm.hackerRank;

public class BeautifulDay {
	public static void main(String[] args) {
		int i = 20;
		int j = 23;
		int k = 6;
		dividedbyK(i, j, k);

	}

	private static void dividedbyK(int i, int j, int k) {
		int c = 0;
		for (int day = i; day <= j; day++) {
			int n = day;
			int rev = 0;
			while (n != 0) {
				rev = rev * 10 + (n % 10);
				n = n / 10;
			}
			if ((day - rev) % k == 0) {
				c++;
			}

		}
		System.out.println(c);
	}
}
