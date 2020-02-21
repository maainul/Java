package intervieQuestions.String._20_FindDuplicateWordFromAString;

public class _20_FindDuplicateWord {

	public static void main(String[] args) {
		String string = "one is one God is one";
		string = string.concat(" ");
		int n = string.length(),index = 0,count = 0;
		String word ="";
		String[] words = new String[10];
		
		
		for (int i = 0; i < n; i++) {
			if(string.charAt(i) != ' ' ) {
				word = word + string.charAt(i);
			}else {
				words[index] = word; 
				index ++;
				word = "";
			}
			
			
		}
		System.out.println(index);
		for (int i = 0; i < index; i++) {
			count = 1;
			for (int j = i+1; j < index; j++) {
				if(words[i].equals(words[j])) {
					count++;
					
					words[j] = "0";
				}
			}
		
		
		if(count >1 && words[i] !="0") {
			System.out.println(words[i]);
		}
		}

	}
}


