package oca;

public class TwoDimentional {

	public static void main(String[] args) {
		int[][] twoD = new int[3][2];
		int n = twoD.length;
		System.out.print(n);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < twoD[i].length; j++) {
				System.out.print(twoD[i][j] + " ");
				System.out.println();

			}

		}
	}
}
