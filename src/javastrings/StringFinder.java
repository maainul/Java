package javastrings;

//a = 97
//z = 122
public class StringFinder {

	public static void main(String[] args) {

		String str1 = "How are you";
		int[] arr1 = new int[256];

		// char x = 'a';
		// System.out.println("char x : "+x);
		// System.out.println("int x : "+(int)x);
		//// arr1[x] = arr1[x] + 1;
		// arr1[x]++;
		//
		// for (int i = 0; i < arr1.length; i++) {
		// System.out.println(arr1[i] + " i "+ i);
		// }

		for (int i = 0; i < str1.length(); i++) {
			arr1[str1.charAt(i)]++;
		}

		int c = 0;
		for (int i = 'a'; i <= 'z'; i++) {
			if (arr1[i] != 0)
				System.out.println(arr1[i]);
			c = c + arr1[i];
			// if (arr1[i] > 1)
			// System.out.println("arr : "+arr1[i] + " i : "+ (char)i);
		}

		System.out.println("Number of WorldS : " + c);

	}

}