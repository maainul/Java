package intervieQuestions.String.character_counting;

public class _17_1_FindTheDuplicateValuesofAnArrayofStringValues {

	public static void main(String[] args) {
		String[] my_array = { "bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu" };
		int count = 0;
		for (int i = 0; i < my_array.length - 1; i++) {
			for (int j = i + 1; j < my_array.length; j++) {
				if ((my_array[i].equals(my_array[j])) && (i != j)) {
					count++;
					System.out.println("Duplicate Element is : " + my_array[j]);
				}
			}

		}
		System.out.println(count);
	}

}
