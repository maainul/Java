package interviewQuestions;

public class _Test {

	public static void main(String[] args) {

		System.out.println("test");

		String str1 = "maainul";
		String str2 = "inmulaa";

		int[] arr1 = new int[256];
		int[] arr2 = new int[256];

		for (int i = 0; i < str1.length(); i++) {
			// System.out.println(str1.charAt(i));
			// System.out.println(arr[str.charAt(i)]);
			// arr1[str1.charAt(i)]++;
			int x = str1.charAt(i);
			arr1[x] = arr1[x] + 1;
			// System.out.println(arr1[x]);
		}
		for (int i = 0; i < str2.length(); i++) {
			// System.out.println(str2.charAt(i));
			// System.out.println(arr[str.charAt(i)]);
			arr2[str2.charAt(i)]++;
		}

		boolean flag = true;
		for (int i = 0; i < 256; i++) {
			if (arr1[i] != arr2[i]) {
				flag = false;
			}
		}

		System.out.println(flag);
	}

}