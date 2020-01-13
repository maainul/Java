package com.mainul.recursion;

public class Sum {
	public static void main(String[] args) {

		int x;
		x = recurs(4, 0);
		System.out.println(x);
	}

	static int recurs(int i, int sum) {
		if (i == 0)
			return sum;
		sum = sum + i;
		return recurs(i - 1, sum);
	}
}
