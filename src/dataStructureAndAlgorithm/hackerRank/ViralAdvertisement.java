package dataStructureAndAlgorithm.hackerRank;

public class ViralAdvertisement {
	public static void main(String[] args) {
		int n = 5;
		adverstise(n);
	}

	private static void adverstise(int n) {
		int cum = 0;
		int people = 5;
		for (int i = 0; i < n; i++) {
			int like = (people / 2);
			int share = (like * 3);
			cum += like;
			people = share;
		}
		System.out.println(cum);
	}

}
