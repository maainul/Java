package intervieQuestions.String._19_CountNumberOfWordsInAString;

public class _19_CountNumberOfWordsInAString {

	public static void main(String[] args) {
		String str =  "One two       three\n four\tfive  "; 
		boolean flag = true;
		int count = 0;
	
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ' || str.charAt(i)=='\n' || str.charAt(i)=='\t'){
				flag = true;
			}
			
			else if (flag) {
				flag = false;
				count++;
			}
			
		}
		System.out.println(count);

	}

}
