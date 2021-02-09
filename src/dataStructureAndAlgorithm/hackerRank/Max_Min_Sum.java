package dataStructureAndAlgorithm.hackerRank;

public class Max_Min_Sum {
	public static void main(String[] args) {
		// int arr[] = {396285104,573261094,759641832,819230764,364801279};
		int arr[] = { 793810624, 895642170, 685903712, 623789054, 468592370 };

		long sum = 0;
		long max_sum = Integer.MIN_VALUE;
		long min_sum = Integer.MAX_VALUE;
		long min = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i != j) {
					sum += arr[j];
					min += arr[j];
				}
			}
			if (max_sum < sum) {
				max_sum = sum;
			}
			if (min_sum > min) {
				min_sum = min;
			}

			sum = 0;
			min = 0;
		}
		System.out.println(max_sum);
		System.out.println(min_sum);
	}
}
