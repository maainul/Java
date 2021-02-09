package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class _49_GroupOfAnagrams {

	public static void main(String[] args) {
		// Driver program
		String strs[] = { "may", "student", "students", "dog", "studentssess", "god", "cat", "act", "tab", "bat",
				"flow", "wolf", "lambs", "amy", "yam", "balms", "looped", "poodle" };
		groudedAnagrams(strs);

		System.out.println(groudedAnagrams(strs));

	}

	private static List<List<String>> groudedAnagrams(String[] strs) {
		List<List<String>> groudedAnagrams = new ArrayList<>();

		HashMap<String, List<String>> map = new HashMap<>();

		for (String current : strs) {
			// System.out.println(current);
			char[] characters = current.toCharArray();

			Arrays.parallelSort(characters);

			String sortedString = new String(characters);

			if (!map.containsKey(sortedString)) {
				map.put(sortedString, new ArrayList<String>());
			}
			map.get(sortedString).add(current);

		}
		groudedAnagrams.addAll(map.values());
		return groudedAnagrams;

	}

}
