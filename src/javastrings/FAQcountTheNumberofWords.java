package javastrings;

public class FAQcountTheNumberofWords {

	public static void main(String[] args) {
		int count = 0;
		String s1 = "India Is My Country";
		String[] s2 = s1.split("\\s");
		for(String s:s2) {
			System.out.println(s);
			count++;
		}
		System.out.println("Number of words:"+count);
		
	}

}
