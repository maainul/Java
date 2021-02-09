package dataStructureAndAlgorithm.hackerRank;

public class DesignPDF {
	public static void main(String[] args) {
		String s = "zaab";
		int max = Integer.MIN_VALUE;
		int h[] = { 1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7 };
		for (int i = 0; i < s.length(); i++) {
			int v = s.charAt(i) - 'a';
			// System.out.println(h[v]);
			if (max < h[v]) {
				max = h[v];
			}

		}
		System.out.println(max * s.length());
		System.out.println(max);
	}
}
