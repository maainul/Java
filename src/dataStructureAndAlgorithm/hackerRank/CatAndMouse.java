package dataStructureAndAlgorithm.hackerRank;

public class CatAndMouse {
	public static void main(String[] args) {
		int x = 2, y = 5, z = 4;
		System.out.println(catAndMouse(x, y, z));
	}

	static String catAndMouse(int x, int y, int z) {
		int mouseA = Math.abs(x - z);
		int mouseB = Math.abs(y - z);
		if (mouseA < mouseB) {
			return "Cat A";
		} else if (mouseA > mouseB) {
			return "Cat B";
		} else {
			return "Mouse C";
		}
	}
}
