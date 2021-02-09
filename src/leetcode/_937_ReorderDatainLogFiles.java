/**
 * @Author Md. Mainul Hasan
 * 
 * 8:22:53 AM
 * 
 * Nov 9, 2020
 *
 */
package leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class _937_ReorderDatainLogFiles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] logs = { "dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero" };

		System.out.println(Arrays.toString(logs));

		System.out.println(Arrays.toString(reorderLogFiles(logs)));

	}

	public static String[] reorderLogFiles(String[] logs) {

		Comparator<String> myComp = new Comparator<String>() {
			@Override
			public int compare(String log1, String log2) {
				System.out.println(log1);
				System.out.println(log2);
				// split each log into two parts: <identifier, content>
				String[] split1 = log1.split(" ", 2);
				System.out.println(Arrays.toString(split1));
				String[] split2 = log2.split(" ", 2);
				System.out.println(Arrays.toString(split2));
				boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
				boolean isDigit2 = Character.isDigit(split2[1].charAt(0));

				// case 1). both logs are letter-logs
				if (!isDigit1 && !isDigit2) {
					// first compare the content
					int cmp = split1[1].compareTo(split2[1]);
					if (cmp != 0)
						return cmp;
					// logs of same content, compare the identifiers
					return split1[0].compareTo(split2[0]);
				}

				// case 2). one of logs is digit-log
				if (!isDigit1 && isDigit2)
					// the letter-log comes before digit-logs
					return -1;
				else if (isDigit1 && !isDigit2)
					return 1;
				else
					// case 3). both logs are digit-log
					return 0;
			}
		};

		Arrays.sort(logs, myComp);
		return logs;
	}

}
