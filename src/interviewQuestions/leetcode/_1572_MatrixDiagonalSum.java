/**
 * @Author {Md. Mainul Hasan}
 * 2:44:12 AM
 * Sep 27, 2020
 */
package interviewQuestions.leetcode;

public class _1572_MatrixDiagonalSum {

	public static void main(String[] args) {
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int s = diagonalSum(mat);
		System.out.println(s);

		int s2 = diagonalSum2(mat);
		System.out.println(s2);
	}

	public static int diagonalSum(int[][] mat) {
		int sum = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (i == j || (i + j) == mat.length - 1) {
					sum += mat[i][j];
				}
			}
		}
		return sum;
	}

	public static int diagonalSum2(int[][] mat) {
		int result = 0;
		int N = mat.length;
		for (int i = 0; i < mat.length; i++) {
			result += mat[i][i] + mat[i][N - 1 - i];
		}
		if (N % 2 == 1) {
			result -= mat[N / 2][N / 2];
		}

		return result;
	}

}
