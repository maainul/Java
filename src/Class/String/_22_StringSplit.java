package Class.String;

//The given example returns total number of words in a string excluding space only. It also includes special characters.
public class _22_StringSplit {
	public static void main(String args[]) {
		String s1 = "java string split method by javatpoint";
		String[] wordStrings = s1.split("\\s");
		String capitalizeString = "";

		for (String wString : wordStrings) {
			String firString = wString.substring(0, 1);
			String afterString = wString.substring(1);
			capitalizeString += firString.toUpperCase() + afterString.toLowerCase() + " ";
			System.out.println(capitalizeString.trim());
		}
		String s2 = "java string split method by javatpoint";

		System.out.println("--------Method of split------");

		for (String w : s2.split("\\s", 6)) {
			System.out.println(w);
		}

		System.out.println();

		String str = "Javatpointtt";
		System.out.println("Returning words:");
		String[] arr = str.split("t", 0);

		for (String w : arr) {
			System.out.println(w);
		}
		System.out.println("Split array length: " + arr.length);

		String testString = "012345678901234567890";
		System.out.println(java.util.Arrays.toString(testString.split("(?<=\\G.{3})")));
		// output : [012, 345, 678, 901, 234, 567, 890]

	}
}
/*
 * java string split method by javatpoint
 * 
 * --------Method of split------ java string split method by javatpoint
 * 
 * Returning words: Java poin Split array length: 2
 */

/*
 * /* Java String to String Array Example This Java String to String Array
 * example shows how to convert String object to String array in Java using
 * split method.
 */

/*
 * public class JavaStringToStringArrayExample {
 * 
 * public static void main(String args[]){
 * 
 * //String which we want to convert to String array String str =
 * "Java String to String Array Example";
 * 
 * /* To convert String object to String array, first thing we need to consider
 * is to how we want to create array.
 * 
 * In this example, array will be created by words contained in the original
 * String object. So, first element of array will contain "java", second will
 * contain "String" and so on.
 * 
 * To convert String to String array, use String[] split(String delimiter)
 * method of Java String class as given below.
 */

/*
 * String strArray[] = str.split(" ");
 * 
 * System.out.println("String converted to String array");
 * 
 * //print elements of String array for(int i=0; i < strArray.length; i++){
 * System.out.println(strArray[i]); } }
 * 
 * }
 * 
 * /* Output of Java String to String Array Example would be String converted to
 * String array Java String to String Array Example
 */
