package interviewQuestions;

public class StringAndStringBufferPerformanceTesr {

	public static String concatWithString() {
		String t = "Java";
		for (int i = 0; i < 1000; i++) {
			t = t + "TPoint";
		}
		return t;
	}

	public static String concatWithStringBuffer() {
		StringBuffer sb = new StringBuffer("Java");
		for (int i = 0; i < 1000; i++) {
			sb.append("Tpoint");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println("Hello World");

		long startTime = System.currentTimeMillis();
		concatWithString();
		System.out.println("Time taken by Concating with String: " + (System.currentTimeMillis() - startTime) + "ms");

		startTime = System.currentTimeMillis();
		concatWithStringBuffer();
		System.out.println(
				"Time taken by Concating with  StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");

	}
}
/*
 * Hello World Time taken by Concating with String: 8ms Time taken by Concating
 * with StringBuffer: 1ms
 */
