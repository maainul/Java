package interviewQuestions.Class.String;

public class _22_2_SplitMethodWithLimit {

	public static void main(String[] args) {
		String str = "2017-05-1,160.050003,160.419998,158.699997,158.839996,139.246414,4935300";

		String delimiters = "\\s+|,\\s*|\\.\\s*";
		String[] tokensVal = str.split(delimiters);

		System.out.print("Count of tokens = " + tokensVal.length);
		System.out.println();
		for (String token : tokensVal) {
			System.out.println(token);
		}

		tokensVal = str.split(delimiters, 3);
		System.out.println("Count of tokens =" + tokensVal.length);
		for (String token : tokensVal) {
			System.out.print(token);
		}

	}

}
