package interviewQuestions;

import java.util.Arrays;

public class _566_ReshapeTheMatrix {

	public static void main(String[] args) {

		int[][] nums = { { 1, 2 }, { 3, 4 } };
		int r = 1, c = 4;
		int[][] b = matrixReshape(nums, r, c);
		System.out.println(Arrays.toString(b));

	}

	public static int[][] matrixReshape(int[][] nums, int r, int c) {
		int row = nums.length;
		System.out.println(row);

		int column = nums[0].length;
		System.out.println(column);

		if (row * column != (r * c))
			return nums;

		int[][] output_array = new int[r][c];
		int row_num = 0, column_num = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				output_array[row_num][column_num] = nums[i][j];
				column_num++;
				if (column_num == c) {
					column_num = 0;
					row_num++;
				}
			}
		}

		return output_array;

	}

}
