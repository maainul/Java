package intervieQuestions.String.CC_7_Anagrams;
//Java program to print anagrams 
//together using dictionary 
import java.util.*; 

public class _7_Anagrams { 
	private static void printAnagrams(String arr[]) 
	{ 
		HashMap<String, List<String> > map = new HashMap<>(); 

		// loop over all words 
		for (int i = 0; i < arr.length; i++) { 

			// convert to char array, sort and 
			// then re-convert to string 
			String word = arr[i]; 
			char[] letters = word.toCharArray(); 
			Arrays.sort(letters); 
			String newWord = new String(letters); 

			// calculate hashcode of string 
			// after sorting 
			if (map.containsKey(newWord)) { 

				map.get(newWord).add(word); 
			} 
			else { 

				// This is the first time we are 
				// adding a word for a specific 
				// hashcode 
				List<String> words = new ArrayList<>(); 
				words.add(word); 
				map.put(newWord, words); 
			} 
		} 

		// print all the values where size is > 1 
		// If you want to print non-anagrams, 
		// just print the values having size = 1 
		for (String s : map.keySet()) { 
			List<String> values = map.get(s); 
			if (values.size() > 1) { 
				System.out.println(values); 
			} 
		} 
	} 

	public static void main(String[] args) 
	{ 

		// Driver program 
		String arr[] = {"may", "student", "students", "dog", 
                "studentssess", "god", "cat", "act", "tab", 
                "bat", "flow", "wolf", "lambs", "amy", "yam", 
                "balms", "looped", "poodle"}; 
		printAnagrams(arr); 
	} 
} 
/*
Input: words[] = { "may", "student", "students", "dog",
        "studentssess", "god", "cat", "act",
        "tab", "bat", "flow", "wolf", "lambs",
        "amy", "yam", "balms", "looped", 
        "poodle"};
Output : 
looped, poodle, 
lambs, balms, 
flow, wolf, 
tab, bat, 
may, amy, yam, 
student, students, studentssess, 
dog, god, 
cat, act, 

All words with same set of characters are printed 
together in a line.
*/
