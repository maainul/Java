package leetcode.array;

public class _1160_FindWordsThatCanBeFormedbyCharacters {

	public static void main(String[] args) {
		 String words[] = {"cat","bt","hat","tree"};
		 String chars = "atach";
		 System.out.println(countCharacters(words,chars));
		 System.out.println(countCharacters2(words,chars));
		 
	}
	
	public static int countCharacters(String[] words, String chars) {   
        int count = 0;
		for (int j = 0; j < words.length; j++) {
			String str = words[j];
			String temp = chars;
			int l = temp.length();
			int strl = str.length();
		
		for (int i = 0; i < chars.length(); i++) {
			char c = chars.charAt(i);
			int index = str.indexOf(c);
			if (index != -1) {
				int tempIndex = temp.indexOf(c);
				str = str.substring(0, index) + str.substring(index + 1);
				temp = temp.substring(0, tempIndex) + temp.substring(tempIndex + 1);
		}
		// System.out.println(chars);
	}
		
			if (l != temp.length()) {
				//chars = temp;
			}
		
		if (str.isBlank()) {
			count = count + strl;
		}
		
		System.out.println(" temp " + temp);
		System.out.println(" char " + chars);
		System.out.println("St " + str.isBlank());
		
	}
		
		System.out.println(count);
		return count;   
	 }
	

	    public static int countCharacters2(String[] words, String chars) {
	      int total = 0;
	        for (int i = 0; i < words.length; i++) {
	            String a = words[i];
	            if (a == null || a == "") {
	                continue;
	            }
	            String[] temp = a.split("");
	            int len = 0;
	            String tempStr = chars;
	            for (int j = 0; j < temp.length; j++) {

	                if (tempStr.contains(temp[j])) {
	                    len++;
	                    tempStr = tempStr.replaceFirst(temp[j],"");
	                }
	            }
	            if (len == temp.length) {
	                total += len;
	            }
	        }
	        return total;
	        
	    }
	
}
